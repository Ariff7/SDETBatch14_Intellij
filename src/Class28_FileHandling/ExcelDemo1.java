package Class28_FileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {

    public static void main(String[] args) throws IOException {

        //we need to know the path of the file
        String path="C:\\Users\\Arif\\IdeaProjects\\SDETBATCH14\\Data\\LA.xlsx";

        //navigate to desired location
        FileInputStream fileInputStream=new FileInputStream(path);

        //that special class that handles the Xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);

//getting to the desired Sheet inside the excelt file wehre data is stored
        Sheet sheet= excelFile.getSheet("Sheet1");

   //get the cell that contains the data rows are index based, so they will start from zero
        Row row0= sheet.getRow(0);
        System.out.println(row0.getCell(0));

        Row row1= sheet.getRow(1);
        System.out.println(row1.getCell(0));


    }
}
