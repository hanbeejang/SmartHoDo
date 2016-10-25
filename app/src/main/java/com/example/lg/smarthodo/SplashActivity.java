package com.example.lg.smarthodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by LG on 2016-10-24.
 */

public class SplashActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        try{
            //2초간 대기하고
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //메인 액티비티로 넘어간다.
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
