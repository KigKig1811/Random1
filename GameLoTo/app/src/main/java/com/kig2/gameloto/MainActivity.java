package com.kig2.gameloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //global
     EditText mtxtMin,mtxtMax,mtxtResult;
     Button mbtnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //local
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        playLoTo();

    }
    private void mapping(){
        mtxtMin=findViewById(R.id.txtMin);
        mtxtMax=findViewById(R.id.txtMax);
        mtxtResult=findViewById(R.id.txtResult);
        mbtnPlay=findViewById(R.id.btnPlay);
    }
     ArrayList arrayList=new ArrayList<Integer>();
    private void playLoTo(){
        //Yêu cầu
        /*
        1: Nhập dữ liệu :(validate)
            requied
            max-min=1
        2: Xử lí
            +Hiện thị kêt quả theo chuỗi như sau : a - b - c ...
            + Các giá trị không được hiện thị 2 lần



        */

        mbtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer min=Integer.valueOf(mtxtMin.getText().toString());
                Integer max=Integer.valueOf(mtxtMax.getText().toString());
                int random=new Random().nextInt((max-min)+1)+min;
                mtxtResult.setText(""+random);
            }
        });



    }



}