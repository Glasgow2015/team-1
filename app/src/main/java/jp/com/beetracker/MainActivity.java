package jp.com.beetracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {


    public static String POST(String url,String json) {
        InputStream inputStream = null;
        String result = "";

        try {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(url);
            StringEntity se = new StringEntity(json);
            httpPost.setEntity(se);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            HttpResponse httpResponse = httpclient.execute(httpPost);
            inputStream = httpResponse.getEntity().getContent();
            if (inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "Did not work!";

        } catch (Exception e) {
            Log.d("InputStream", e.getLocalizedMessage());
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try
        {

            JSONObject jo = new JSONObject("[\n" +"  {\n" +
                    "    \"_id\": \"563ea6a4a4196bb5e694f67e\",\n" +
                    "    \"index\": 0,\n" +
                    "    \"guid\": \"2bafd604-347e-4b17-9197-4c89a9b7dc18\",\n" +
                    "    \"isActive\": false,\n" +
                    "    \"balance\": \"$2,243.10\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 39,\n" +
                    "    \"eyeColor\": \"blue\",\n" +
                    "    \"name\": \"Hensley Weber\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"company\": \"TALKALOT\",\n" +
                    "    \"email\": \"hensleyweber@talkalot.com\",\n" +
                    "    \"phone\": \"+1 (882) 473-2560\",\n" +
                    "    \"address\": \"487 Osborn Street, Frystown, West Virginia, 9721\",\n" +
                    "    \"about\": \"Laborum proident minim ad et est esse ad occaecat in cupidatat minim cupidatat. In est non in voluptate dolor exercitation duis cupidatat qui commodo elit aliquip consequat. Ex reprehenderit ut et elit fugiat esse nostrud tempor esse do quis reprehenderit. Sunt elit ipsum elit in fugiat. Laboris laboris consequat adipisicing deserunt non.\\r\\n\",\n" +
                    "    \"registered\": \"2015-08-27T06:21:42 -01:00\",\n" +
                    "    \"latitude\": -31.35322,\n" +
                    "    \"longitude\": 7.775295,\n" +
                    "    \"tags\": [\n" +
                    "      \"est\",\n" +
                    "      \"incididunt\",\n" +
                    "      \"veniam\",\n" +
                    "      \"eu\",\n" +
                    "      \"elit\",\n" +
                    "      \"laborum\",\n" +
                    "      \"velit\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Mercer Parsons\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Rivera Morrow\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Adeline Randolph\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Hensley Weber! You have 6 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"strawberry\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a40fcd6928b37f24a8\",\n" +
                    "    \"index\": 1,\n" +
                    "    \"guid\": \"b72f3f72-125e-4a4c-9444-d81885140847\",\n" +
                    "    \"isActive\": true,\n" +
                    "    \"balance\": \"$3,280.54\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 25,\n" +
                    "    \"eyeColor\": \"blue\",\n" +
                    "    \"name\": \"Stefanie Hooper\",\n" +
                    "    \"gender\": \"female\",\n" +
                    "    \"company\": \"XTH\",\n" +
                    "    \"email\": \"stefaniehooper@xth.com\",\n" +
                    "    \"phone\": \"+1 (820) 582-2872\",\n" +
                    "    \"address\": \"381 Friel Place, Kaka, Hawaii, 2016\",\n" +
                    "    \"about\": \"Veniam qui qui quis enim pariatur officia consequat do do reprehenderit culpa ea deserunt duis. Adipisicing aliqua eiusmod commodo voluptate aliquip excepteur laboris amet ut irure sit tempor proident exercitation. Minim eiusmod est sit reprehenderit labore eiusmod fugiat. Minim ipsum nostrud irure dolor mollit fugiat ea id labore occaecat commodo laborum amet consequat. Aute do labore quis pariatur dolor ex nulla cupidatat. Fugiat fugiat ullamco Lorem dolore magna.\\r\\n\",\n" +
                    "    \"registered\": \"2015-01-18T01:50:04 -00:00\",\n" +
                    "    \"latitude\": 26.487767,\n" +
                    "    \"longitude\": -144.453243,\n" +
                    "    \"tags\": [\n" +
                    "      \"exercitation\",\n" +
                    "      \"ullamco\",\n" +
                    "      \"commodo\",\n" +
                    "      \"exercitation\",\n" +
                    "      \"fugiat\",\n" +
                    "      \"Lorem\",\n" +
                    "      \"dolore\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Fay Walter\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Buckner Morgan\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Hardy Nash\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Stefanie Hooper! You have 9 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"banana\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a4ddd4772cbc76188e\",\n" +
                    "    \"index\": 2,\n" +
                    "    \"guid\": \"90a0da63-1ad4-447d-a7a1-dfef18e0094c\",\n" +
                    "    \"isActive\": true,\n" +
                    "    \"balance\": \"$3,586.06\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 26,\n" +
                    "    \"eyeColor\": \"blue\",\n" +
                    "    \"name\": \"Debra Moses\",\n" +
                    "    \"gender\": \"female\",\n" +
                    "    \"company\": \"MICRONAUT\",\n" +
                    "    \"email\": \"debramoses@micronaut.com\",\n" +
                    "    \"phone\": \"+1 (961) 452-2381\",\n" +
                    "    \"address\": \"300 Ditmas Avenue, Woodlake, New Mexico, 8216\",\n" +
                    "    \"about\": \"Proident minim nisi ea consequat. Cillum cillum cillum dolor nostrud commodo ad pariatur fugiat laboris dolor. Eiusmod non cillum cillum incididunt ullamco est occaecat sit. Sint laboris fugiat mollit nostrud.\\r\\n\",\n" +
                    "    \"registered\": \"2015-04-30T04:32:05 -01:00\",\n" +
                    "    \"latitude\": -63.626901,\n" +
                    "    \"longitude\": 129.866432,\n" +
                    "    \"tags\": [\n" +
                    "      \"aliquip\",\n" +
                    "      \"laboris\",\n" +
                    "      \"ad\",\n" +
                    "      \"elit\",\n" +
                    "      \"nisi\",\n" +
                    "      \"Lorem\",\n" +
                    "      \"adipisicing\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Collier Joyner\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Darlene Sykes\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Myra Santos\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Debra Moses! You have 8 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"apple\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a47fdb48f42bb21802\",\n" +
                    "    \"index\": 3,\n" +
                    "    \"guid\": \"54eb96fd-b89e-45d3-bfa8-c3772286214f\",\n" +
                    "    \"isActive\": true,\n" +
                    "    \"balance\": \"$2,423.05\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 36,\n" +
                    "    \"eyeColor\": \"blue\",\n" +
                    "    \"name\": \"Rivas Cannon\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"company\": \"AMTAP\",\n" +
                    "    \"email\": \"rivascannon@amtap.com\",\n" +
                    "    \"phone\": \"+1 (921) 510-2117\",\n" +
                    "    \"address\": \"389 McClancy Place, Fairview, Michigan, 6910\",\n" +
                    "    \"about\": \"Irure cillum exercitation aliquip elit incididunt excepteur laborum ipsum ipsum incididunt. Veniam proident excepteur enim incididunt nisi occaecat cupidatat dolor. Non labore eiusmod aliquip veniam amet non deserunt deserunt commodo minim. Labore ex occaecat excepteur amet est do sit. Nostrud anim labore ex adipisicing culpa aliquip elit aute consequat nisi qui id. Enim eiusmod qui quis duis enim ut sint ut ullamco nostrud. Velit nostrud laborum incididunt consequat aliquip esse amet officia nostrud.\\r\\n\",\n" +
                    "    \"registered\": \"2014-01-22T07:21:06 -00:00\",\n" +
                    "    \"latitude\": 2.922881,\n" +
                    "    \"longitude\": 83.616444,\n" +
                    "    \"tags\": [\n" +
                    "      \"nisi\",\n" +
                    "      \"dolore\",\n" +
                    "      \"esse\",\n" +
                    "      \"non\",\n" +
                    "      \"officia\",\n" +
                    "      \"labore\",\n" +
                    "      \"irure\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Avila Hopper\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Lucy Silva\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Deanna Henderson\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Rivas Cannon! You have 10 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"apple\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a45f471f93d3a3bf05\",\n" +
                    "    \"index\": 4,\n" +
                    "    \"guid\": \"b5f44aab-142d-40e5-9479-9202ea75253c\",\n" +
                    "    \"isActive\": true,\n" +
                    "    \"balance\": \"$3,540.08\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 36,\n" +
                    "    \"eyeColor\": \"green\",\n" +
                    "    \"name\": \"Dixie Sosa\",\n" +
                    "    \"gender\": \"female\",\n" +
                    "    \"company\": \"TUBESYS\",\n" +
                    "    \"email\": \"dixiesosa@tubesys.com\",\n" +
                    "    \"phone\": \"+1 (936) 477-3960\",\n" +
                    "    \"address\": \"282 Locust Street, Kimmell, Wisconsin, 2147\",\n" +
                    "    \"about\": \"Anim id eiusmod quis exercitation. Labore excepteur consequat nostrud non. Minim est dolore eu ut sint dolor et elit cupidatat qui tempor exercitation. Laborum proident eu ex excepteur sunt. Ipsum nostrud reprehenderit ad dolor laboris.\\r\\n\",\n" +
                    "    \"registered\": \"2014-09-22T06:24:32 -01:00\",\n" +
                    "    \"latitude\": 37.120485,\n" +
                    "    \"longitude\": -72.06587,\n" +
                    "    \"tags\": [\n" +
                    "      \"mollit\",\n" +
                    "      \"officia\",\n" +
                    "      \"mollit\",\n" +
                    "      \"voluptate\",\n" +
                    "      \"veniam\",\n" +
                    "      \"aliqua\",\n" +
                    "      \"mollit\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Eaton Pope\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Meyer Bauer\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Dawson Wynn\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Dixie Sosa! You have 9 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"strawberry\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a47e0bc1e5dba1c196\",\n" +
                    "    \"index\": 5,\n" +
                    "    \"guid\": \"321873b6-5940-4039-b796-c67f81e536ea\",\n" +
                    "    \"isActive\": false,\n" +
                    "    \"balance\": \"$2,122.17\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 26,\n" +
                    "    \"eyeColor\": \"green\",\n" +
                    "    \"name\": \"Bray Shaffer\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"company\": \"ORBEAN\",\n" +
                    "    \"email\": \"brayshaffer@orbean.com\",\n" +
                    "    \"phone\": \"+1 (902) 536-2632\",\n" +
                    "    \"address\": \"158 Delevan Street, Colton, Texas, 5875\",\n" +
                    "    \"about\": \"Esse adipisicing enim commodo commodo irure commodo. Anim ea enim in ea id nostrud sunt sunt fugiat dolore. Quis eiusmod ullamco deserunt cupidatat esse irure mollit aliquip id. Cupidatat aliqua cupidatat culpa et ea veniam labore mollit irure. Nisi deserunt aliquip irure labore ex dolor sunt sit consequat et esse. Nisi adipisicing aliquip in incididunt laboris minim incididunt adipisicing exercitation voluptate Lorem. Sint id nulla aliquip excepteur occaecat.\\r\\n\",\n" +
                    "    \"registered\": \"2014-11-25T03:36:10 -00:00\",\n" +
                    "    \"latitude\": -23.27628,\n" +
                    "    \"longitude\": 9.260293,\n" +
                    "    \"tags\": [\n" +
                    "      \"mollit\",\n" +
                    "      \"commodo\",\n" +
                    "      \"mollit\",\n" +
                    "      \"occaecat\",\n" +
                    "      \"reprehenderit\",\n" +
                    "      \"ipsum\",\n" +
                    "      \"ex\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Rice Garza\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Tasha Frost\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Best Wooten\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Bray Shaffer! You have 10 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"strawberry\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"_id\": \"563ea6a41dda2b7eba2e65fd\",\n" +
                    "    \"index\": 6,\n" +
                    "    \"guid\": \"1a6192df-11cb-48e8-bda1-a164b26bf43d\",\n" +
                    "    \"isActive\": true,\n" +
                    "    \"balance\": \"$3,465.87\",\n" +
                    "    \"picture\": \"http://placehold.it/32x32\",\n" +
                    "    \"age\": 38,\n" +
                    "    \"eyeColor\": \"green\",\n" +
                    "    \"name\": \"Powers Levy\",\n" +
                    "    \"gender\": \"male\",\n" +
                    "    \"company\": \"VIDTO\",\n" +
                    "    \"email\": \"powerslevy@vidto.com\",\n" +
                    "    \"phone\": \"+1 (806) 422-3558\",\n" +
                    "    \"address\": \"640 Holt Court, Henrietta, Georgia, 1842\",\n" +
                    "    \"about\": \"Mollit Lorem aute elit laboris. Deserunt qui eiusmod nostrud cillum deserunt eiusmod. Labore in cillum veniam enim. Quis sunt do velit incididunt Lorem laboris aliqua aliquip fugiat do eiusmod incididunt aliquip. Incididunt occaecat duis deserunt consequat id.\\r\\n\",\n" +
                    "    \"registered\": \"2015-05-07T02:06:37 -01:00\",\n" +
                    "    \"latitude\": -65.560779,\n" +
                    "    \"longitude\": -114.514435,\n" +
                    "    \"tags\": [\n" +
                    "      \"non\",\n" +
                    "      \"culpa\",\n" +
                    "      \"voluptate\",\n" +
                    "      \"adipisicing\",\n" +
                    "      \"commodo\",\n" +
                    "      \"velit\",\n" +
                    "      \"anim\"\n" +
                    "    ],\n" +
                    "    \"friends\": [\n" +
                    "      {\n" +
                    "        \"id\": 0,\n" +
                    "        \"name\": \"Magdalena Garrison\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 1,\n" +
                    "        \"name\": \"Adela Casey\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"id\": 2,\n" +
                    "        \"name\": \"Colon Mckenzie\"\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"greeting\": \"Hello, Powers Levy! You have 7 unread messages.\",\n" +
                    "    \"favoriteFruit\": \"strawberry\"\n" +
                    "  }\n" +
                    "]");


            String url = "http://ec2-54-74-114-193.eu-west-1.compute.amazonaws.com";
            MainActivity.POST(url,jo.toString());
            // Defined URL  where to send data
            URL uri = new URL("http://ec2-54-74-114-193.eu-west-1.compute.amazonaws.com");

            // Send POST data request

            URLConnection conn = uri.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write("hello");
            wr.flush();

            // Get the server response

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;

            // Read Server Response
            String text = "";
            while((line = reader.readLine()) != null)
            {
                // Append server response in string
                sb.append(line + "\n");
            }
            text = sb.toString();
        }
        catch(Exception ex)
        {

        }
        finally
        {
            try
            {

                //reader.close();
            }

            catch(Exception ex) {}
        }

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
