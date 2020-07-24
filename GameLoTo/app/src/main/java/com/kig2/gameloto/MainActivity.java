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
    private EditText txtMin,txtMax,txtResult;
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        playLoTo();

    }
    private void mapping(){
        txtMin=findViewById(R.id.txtMin);
        txtMax=findViewById(R.id.txtMax);
        txtResult=findViewById(R.id.txtResult);
        btnPlay=findViewById(R.id.btnPlay);
    }
     ArrayList arrayList=new ArrayList<Integer>();
    private void playLoTo(){
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer min=Integer.valueOf(txtMin.getText().toString());
                Integer max=Integer.valueOf(txtMax.getText().toString());
                int random=new Random().nextInt((max-min)+1)+min;
                txtResult.setText(""+random);
            }
        });



    }



}