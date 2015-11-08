package jp.com.beetracker;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by ross on 07/11/2015.
 */
public class SendOnceConnection extends IntentService {

    public SendOnceConnection(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
