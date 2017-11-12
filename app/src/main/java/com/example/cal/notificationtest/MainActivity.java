package com.example.cal.notificationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.util.Log;
import android.app.Notification;


public class MainActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID = 45612;

    private NotificationUtils mNotificationUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        notification = new NotificationCompat.Builder(this);
//        notification.setAutoCancel(true);
        mNotificationUtils = new NotificationUtils(this);

    }

    public void notificationButtonClicked(View view){

//        if(!TextUtils.isEmpty(title) && !TextUtils.isEmpty(author)) {
//            Notification.Builder nb = mNotificationUtils.
//                    getAndroidChannelNotification(title, "By " + author);
//
        Notification.Builder nb = mNotificationUtils.
                getAndroidChannelNotification("titel", "By " + "cal");
        mNotificationUtils.getManager().notify(101, nb.build());

        Log.e("test", "clicked");
    }
}
