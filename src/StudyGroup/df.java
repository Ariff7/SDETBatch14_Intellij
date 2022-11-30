package StudyGroup;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class df {
    public static void main(String[] args) {


        Map<String,String>info=new LinkedHashMap<>();
        info.put("Street","Patrick ST");
        info.put("Suite","265");
        info.put("City","Vienna");
        info.put("Zip","22180");
        info.put("Country","United State");

        Iterator<Map.Entry<String, String>> it = info.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> data = it.next();
            System.out.println(data.getValue());
        }

    }
}