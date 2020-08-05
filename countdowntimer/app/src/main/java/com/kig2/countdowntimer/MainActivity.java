package com.kig2.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView iv1;
    int[] mArrayImage={
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e
    };
    int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countDowntimer();


    }

    private void countDowntimer(){
        iv1=findViewById(R.id.iv1);
        final CountDownTimer countDownTimer=new CountDownTimer(1100,1000) {
            @Override
            public void onTick(long l) {
                if(mCount>4){
                    mCount=0;
                }
                iv1.setImageResource(mArrayImage[mCount++]);
            }

            @Override
            public void onFinish() {
                this.start();
            }
        };
        countDownTimer.start();
    }
}
