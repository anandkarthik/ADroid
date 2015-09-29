package com.example.android.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Toast appToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view) {
        Context context = getApplicationContext();
        String appName = null;
        switch (view.getId()) {
            case R.id.spotify:
                appName = "Spotify Streamer";
                break;
            case R.id.beacon:
                appName = "Beacon Reader";
                break;
            case R.id.bigger:
                appName = "Build Bigger";
                break;
            case R.id.capstone:
                appName = "Capstone";
                break;
            case R.id.library:
                appName = "Library";
                break;
            case R.id.scores:
                appName = "Scores";
                break;
            default:
                appName = "Oops";
        }
        CharSequence text = "This button will launch my "+appName+" app!";

        int duration = Toast.LENGTH_SHORT;

        appToast = Toast.makeText(context, text, duration);
        if(appToast !=null){
            appToast.cancel();
        }
        appToast.show();
        // Do something in response to button click
    }

}
