package Class29_;

import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
        var properties= ConfigReader.read(path);




        String excelPath="Data/LA.xlsx";
        var excelData= ExcelReader.read(excelPath);
        System.out.println(excelData);

    }
}
