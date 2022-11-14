package Class29_;

import utils.ExcelReader;

import java.io.IOException;

public class Review1 {
    public static void main(String[] args) throws IOException {

       /*
       We wanted to read data from files+
        */

        String path="Data/Book.xlsx";
        var data= ExcelReader.read(path);
        //System.out.println(data);

       /* Map<String,String>row1=data.get(0);
        System.out.println(row1.get("Name")); //Arif
*/

        for(var row:data){
            System.out.println(row);
    }
    }
}
