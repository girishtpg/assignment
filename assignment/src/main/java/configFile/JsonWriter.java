package configFile;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
public class JsonWriter {
    protected String JSON_FILE_PATH = "Config.json";

    public void write_to_json(String key, String value){
        // WRITE TO JSON FILE
        try {
            JSONObject jo = new JSONObject();
            // putting data to JSONObject
            jo.put(key, value);
            PrintWriter pw = new PrintWriter(JSON_FILE_PATH);
            pw.write(jo.toJSONString());
            pw.flush();
            pw.close();
        }catch (FileNotFoundException ex){
//            System.out.println(ex);
        }
    }

    public String read_value_from_json(String key){
        //READ FROM JSON
        try {
            Object obj = new JSONParser().parse(new FileReader(JSON_FILE_PATH));
            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;
            // getting firstName and lastName
            String value = (String) jo.get(key);
//            System.out.println(value);
            return value;
        }catch(Exception ex){
//            System.out.println(ex);
            return "";
        }
    }
}
