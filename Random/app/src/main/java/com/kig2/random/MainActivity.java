package com.kig2.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int value=tinhTong(5,10);
//        Log.d("AAA",String.valueOf(value));
//        inThongBao("Test");
//        long value=Math.round(1.4);
       // Log.d("AAA","Round Value" + value);
         int min = 21;
         int max = 101;
         int random = new Random().nextInt((max - min) + 1) +min;
        Log.d("AAA",random+"");
    }
//    private int tinhTong(int a,int b){
//        int ketqua=a+b;
//        return ketqua;
//    }
//    private void inThongBao(String msg){
//        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
//    }




}