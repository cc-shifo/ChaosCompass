package com.chaos.chaoscompass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_compass).setOnClickListener(this);
        findViewById(R.id.tv_oclock).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_compass:
                startActivity(new Intent(MainActivity.this,CompassActivity.class));
                break;
            case R.id.tv_oclock:
                startActivity(new Intent(MainActivity.this,OclockActivity.class));
                break;
        }
    }
}
