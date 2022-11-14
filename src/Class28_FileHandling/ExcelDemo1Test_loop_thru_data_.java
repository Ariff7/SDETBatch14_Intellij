package Class28_FileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1Test_loop_thru_data_ {
    public static void main(String[] args) throws IOException {

        String path="Data/LA.xlsx";

        //connect to that file
        FileInputStream fileInputStream=new FileInputStream(path);

        //load the data
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);

        Sheet sheet=excel.getSheet("Sheet1");

        //see how many rows there is
        int noOfRows=sheet.getPhysicalNumberOfRows(); //returns how many rows in ACTUAl that contains data in the sheet
        // System.out.println(noOfRows);

        for (int i = 0; i < 5; i++) {
            Row row= sheet.getRow(i);
            int noOfCell= row.getPhysicalNumberOfCells(); //returns the total numbers of cells that contain the data
            for (int j = 0; j < noOfCell; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" "); //FirstName LastName Age Salary Arif Aliyev 22.0 120000.0 Magamed Amirshayev 6.0 10.0 Saira Jawad 18.0 95000.0 Russell Westbrook 34.0 4.7E7

            }
            System.out.println(""); //FirstName LastName Age Salary
                                    // Arif Aliyev 22.0 120000.0
                                    //   Magamed Amirshayev 6.0 10.0
                                   //   Saira Jawad 18.0 95000.0
                                    //Russell Westbrook 34.0 4.7E7
        }




    }
}
