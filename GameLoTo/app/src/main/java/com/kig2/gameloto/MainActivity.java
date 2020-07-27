package com.kig2.gameloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //global
    EditText mtxtMin, mtxtMax, mtxtResult;
    Button mbtnPlay,mbtnReset,mbtnAdd;
    String mValue="";
    Random mRandom;
    int mValueRandom=0;
    ArrayList mArrayRange = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //local
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        playLoTo();

    }

    private void mapping() {
        mtxtMin = findViewById(R.id.txtMin);
        mtxtMax = findViewById(R.id.txtMax);
        mtxtResult = findViewById(R.id.txtResult);
        mbtnPlay = findViewById(R.id.btnPlay);
        mbtnAdd=findViewById(R.id.btnAdd);
        mbtnReset=findViewById(R.id.btnReset);
        mRandom = new Random();
    }



    private void playLoTo() {
        //Yêu cầu
        /*
        1: Nhập dữ liệu :(validate)
            requied
            max-min=1
        2: Xử lí
            +Hiện thị kêt quả theo chuỗi như sau : a - b - c ...
            + Các giá trị không được hiện thị 2 lần
        */
        mbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sMin=mtxtMin.getText().toString();
                String sMax=mtxtMax.getText().toString();
                Integer min = Integer.valueOf(sMin);
                Integer max = Integer.valueOf(sMax);
                if (sMax.isEmpty() || sMin.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Information is requied", Toast.LENGTH_LONG).show();
                    return;
                    // Điều kiện 1: min <= max
                    //           2:max =0 => min=0;max=1
                }
                if (min >= max) {
                    max = min + 1;

                }
                mtxtMin.setText(""+min);
                mtxtMax.setText(""+max);
                // Add Range
                if(mArrayRange.size()>0){
                    mArrayRange.clear();
                }
                for (int i=min;i<=max;i++){
                    mArrayRange.add(i);
                }
                Log.d("AAA",mArrayRange.size()+"");
            }
        });
        mbtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xu li clear array new khac null
                if(mArrayRange !=null && mArrayRange.size()>0){
                    mArrayRange.clear();
                    mtxtMax.setText("");
                    mtxtMin.setText("");
                }
            }
        });
        mbtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Task:1 xu li random
//                 random gia tri trong mang
//                 hien thi gia tri va sau do xoa no di
//                Task 2: hiej=n thi nhu chuoi nhu sau
//                 chuoi: 1 - 2 - 3 - 4
//                10 -> 0-9 : random trả ve index trong mảng
                if(mArrayRange.size()<=0){
                    Toast.makeText(MainActivity.this,"Kết thúc!!!",Toast.LENGTH_LONG).show();
                }
                int index=mRandom.nextInt(mArrayRange.size());
                mValueRandom = (int) mArrayRange.get(index);
                mValue += mValueRandom +"-";
                mtxtResult.setText(mValue);
                mArrayRange.remove(index);


            }
        });


    }


}