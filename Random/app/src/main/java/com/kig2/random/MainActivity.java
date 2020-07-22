package com.kig2.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int value=tinhTong(5,10);
//        Log.d("AAA",String.valueOf(value));
        inThongBao("Test");
    }
    private int tinhTong(int a,int b){
        int ketqua=a+b;
        return ketqua;
    }
    private void inThongBao(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }




}