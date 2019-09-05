import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

class JavaReader{

    public static jasonreader(){
        URL data = new URL("https://jsonmock.hackerrank.com/api/stocks");
        BufferedReader in = new BufferedReader(new InputStreamReader(data.openStream()));
        StringBuilder sb = new StringBuilder();
        String inputLine;
        while(inputLine=in.readLine()) != null){
            sb.append(inputLine);
        }
        return
        in.close();
        JSONObject newobj = new JSONObject();
        JSONArray array = obj.getJSONArray("data");
        for(int i=0; i<array.length(); i++) {
            JSONObject newObj = array.getJSONObject(i);
            System.out.println(newObj);
          }

    public static void main(String[] args) {
        JavaReader.jasonreader();
    }
}

