package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.loadLibrary("hello-jni");
        String test = stringFromJNI(20);
        TextView main_text =  (TextView)findViewById(R.id.main_text);
        main_text.setText(test);

    }

    public native String stringFromJNI(int x);

    public int add(int a, int b) {
        return a + b;
    }







}

