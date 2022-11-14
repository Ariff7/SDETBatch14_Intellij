package Class26_Sets_and_LinkedList;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExCelDemo {
    public static void main(String[] args) throws IOException {


        String path1="C:\\Users\\Arif\\Desktop\\SyntaxExcel\\Testt.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path1);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet= xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));

    }
}
