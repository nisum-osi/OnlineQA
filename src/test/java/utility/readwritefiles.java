package utility;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class readwritefiles {

    public static Map readwritefiles() throws Exception   {
        Object obj = new JSONParser().parse(new FileReader("C:\\Narayana\\SDT\\May20\\OnlineRetail\\src\\test\\java\\utility\\testdata.json"));
        System.out.println("file path value is : "+ obj);
        JSONObject jo = (JSONObject) obj;
        HashMap<String, String> credentials = new HashMap<String,String>();
        try{
            System.out.println("in try block ");
            System.out.println("email id is "+ jo.get("emailId"));
            System.out.println("email id is "+ jo.get("password"));
            String emailId = (String) jo.get("emailId");
            credentials.put("email",(String) jo.get("emailId"));
            credentials.put("password",(String) jo.get("password"));
            String password = (String) jo.get("password");
        } catch(Exception e){
            System.out.println("Exception : "+ e.getMessage());
        }
        System.out.println("credentials are "+credentials);
        return credentials;
    }
}
