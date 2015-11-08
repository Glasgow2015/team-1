package jp.com.beetracker;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Log;

/**
 * Created by ross on 07/11/2015.
 */
public class CheckConnection extends Activity {

    private Intent mServiceIntent;

    public CheckConnection()

    {
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            // fetch data
        } else {
            Log.v("V", "Not connected to network start service");
            mServiceIntent = new Intent(this, SendOnceConnection.class);
            this.startService(mServiceIntent);
        }
    }
}
