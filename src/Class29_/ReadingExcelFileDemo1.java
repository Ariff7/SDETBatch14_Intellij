package Class29_;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
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
        for (int i = 0; i <noOfRows ; i++) {
            Row row= sheet.getRow(i); //get a row from sheet one by one through loop
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println(" ");
        }


    }
}
