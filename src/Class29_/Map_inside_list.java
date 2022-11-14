package Class29_;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Map_inside_list {
    public static void main(String[] args) throws IOException {

        //Location of the file on your HardDrive where file is stored
        String path="Data/LA.xlsx";

        //Reads the data from HardDrive brings it to RAM in the raw form  1010101010
        //In simple words we can say computer has navigated to that file
        FileInputStream fileInputStream=new FileInputStream(path);

        //this class converts the raw bytes to Excel format
        //In simple words it is that special software that helps us read and write data to an Excel file
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);

        Sheet sheet=excel.getSheet("Sheet1");

        int noOfRows= sheet.getPhysicalNumberOfRows();
        Row headerRow= sheet.getRow(0); //getting the first row so wer can use it as keys for our map

        //the Map that will store the data for each row
        ArrayList<LinkedHashMap<String,String>>excelData=new ArrayList<>(); //a list that can hold maps

        //a loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo <noOfRows ; rowNo++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap();

            //get a dataRow from sheet one by one through loop
            Row dataRow= sheet.getRow(rowNo); //get a row from sheet one by one through loop

            //getting the count of how many cells contain the data
            int noOfCells=dataRow.getPhysicalNumberOfCells();

            //a loop to go through all the cells
            for (int cellNo= 0; cellNo < noOfCells; cellNo++) {

                //getting keys from header row and values  from data row
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);

                //or    rowMap.put(headerRow.getCell(cellNo).toString(),dataRow.getCell(cellNo).toString());

            }
            excelData.add(rowMap);
           // System.out.println(rowMap);
        }

        System.out.println(excelData+" ");
    }
}
