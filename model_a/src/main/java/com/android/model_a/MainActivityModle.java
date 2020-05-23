package com.android.model_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/test/activity")
public class MainActivityModle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("xingjiaming","is in ");
        setContentView(R.layout.activity_main_model);
    }
}
