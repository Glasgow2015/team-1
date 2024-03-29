package jp.com.beetracker;

import android.content.Entity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static DBHelper mydatabase;
    public static int id;

    public static String POST(String url,String json) {
        InputStream inputStream = null;
        String result = "";

        try {
            HttpGet httpGet = new HttpGet();


            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            StringEntity se = new StringEntity(json);
            httpPost.setEntity(se);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            HttpResponse httpResponse = httpclient.execute(httpPost);
            inputStream = httpResponse.getEntity().getContent();
            if (inputStream != null) {
                //Log.d("v", EntityUtils.toString(httpResponse.getEntity()));
                result = convertInputStreamToString(inputStream);
            }else {
                result = "Did not work!";
                mydatabase.insertJson(id++, json);
            }

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
            mydatabase.insertJson(id++,json);
        }
        return result;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException{
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //SunExposure sun, HiveType hivetype, Date date, Double lat, Double lng, int hiveNo, String apiaryName
        Hive hive = new Hive(new Date().getTime(),40.44,54.00,0,"Apiary2");
        //HiveWrapper hiveWrapper = new HiveWrapper("hives",hive);
        hive.setTable("hives");
        Gson gson = new Gson();
        String json = gson.toJson(hive);
        int num = json.length();



        String url = "http://54.74.114.193:8000/ap/hives/";
        MainActivity.POST(url,"{\"number\":\"1\",\"apname\":\"test\",\"log\":\"54.43\",\"lat\":\"23.4\",\"date\":\"45435435453\"}");
//            // Defined URL  where to send data
//            URL uri = new URL("http://ec2-54-74-114-193.eu-west-1.compute.amazonaws.com");
//
//            // Send POST data request
//
//            URLConnection conn = uri.openConnection();
//            conn.setDoOutput(true);
//            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//            wr.write("hello");
//            wr.flush();
//
//            // Get the server response
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            StringBuilder sb = new StringBuilder();
//            String line = null;
//
//            // Read Server Response
//            String text = "";
//            while((line = reader.readLine()) != null)
//            {
//                // Append server response in string
//                sb.append(line + "\n");
//            }
//            text = sb.toString();
//        }catch(Exception ex){
//
//        }finally{
//        try
//            {
//
//                //reader.close();
//            }
//
//            catch(Exception ex) {}
//        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
