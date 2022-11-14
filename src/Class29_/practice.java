package Class29_;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;

public class practice {
    public static void main(String[] args) throws IOException {

        String path="Data/Book.xlsx";

        FileInputStream fis=new FileInputStream(path);

        XSSFWorkbook xsf=new XSSFWorkbook(fis);

        Sheet sheet=xsf.getSheet("Sheet1");

        int nOfRows=sheet.getPhysicalNumberOfRows();
        Row headerRow= sheet.getRow(0);

        LinkedHashMap<String,String>rowMap=new LinkedHashMap<>();

        for (int rowNo = 1; rowNo <nOfRows ; rowNo++) {
            Row dataRow= sheet.getRow(rowNo);
            int noOfCells=dataRow.getPhysicalNumberOfCells();
            for(int cellNo=0; cellNo<noOfCells; cellNo++){
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key,value);
            }System.out.println(rowMap);
        }

    }
}
