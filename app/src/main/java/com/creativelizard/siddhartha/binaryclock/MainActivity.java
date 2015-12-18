package com.creativelizard.siddhartha.binaryclock;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Chronometer;
import android.widget.ImageView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ImageView img00,img01,img02,img03,img04,img05;
    private ImageView img10,img11,img12,img13,img14,img15;
    private ImageView img20,img21,img22,img23,img24,img25;
    private ImageView img30,img31,img32,img33,img34,img35;
    int sec,min,hou ;
    private String HH,MM,SS;
    private Chronometer timer;
    private int color_block,color_block2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        setBlock_Color();
        timer.start();
        setToDisplay();
    }

    private void setBlock_Color() {

        color_block = Color.BLACK;
        color_block2 = Color.MAGENTA;
    }

    private void setToDisplay() {

        timer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                timeGet();
                methodHH(String.valueOf(hou));
                methodMM(String.valueOf(min));
                methodSS(String.valueOf(sec));
                Log.e("Tick","tick");
            }
        });

        Log.e("HOU:", String.valueOf(hou));

    }

    private void timeGet() {
        Calendar c = Calendar.getInstance();
        sec = c.get(Calendar.SECOND);
        min = c.get(Calendar.MINUTE);
        hou = c.get(Calendar.HOUR);
    }

    private void initialize() {

        //region Row 1.
        img00 = (ImageView)findViewById(R.id.img00);
        img01 = (ImageView)findViewById(R.id.img01);
        img02 = (ImageView)findViewById(R.id.img02);
        img03 = (ImageView)findViewById(R.id.img03);
        img04 = (ImageView)findViewById(R.id.img04);
        img05 = (ImageView)findViewById(R.id.img05);
        //endregion
        //region Row 2.
        img10 = (ImageView)findViewById(R.id.img10);
        img11 = (ImageView)findViewById(R.id.img11);
        img12 = (ImageView)findViewById(R.id.img12);
        img13 = (ImageView)findViewById(R.id.img13);
        img14 = (ImageView)findViewById(R.id.img14);
        img15 = (ImageView)findViewById(R.id.img15);
        //endregion
        //region Row 3.
        img20 = (ImageView)findViewById(R.id.img20);
        img21 = (ImageView)findViewById(R.id.img21);
        img22 = (ImageView)findViewById(R.id.img22);
        img23 = (ImageView)findViewById(R.id.img23);
        img24 = (ImageView)findViewById(R.id.img24);
        img25 = (ImageView)findViewById(R.id.img25);
        //endregion
        //region Row 4.
        img30 = (ImageView)findViewById(R.id.img30);
        img31 = (ImageView)findViewById(R.id.img31);
        img32 = (ImageView)findViewById(R.id.img32);
        img33 = (ImageView)findViewById(R.id.img33);
        img34 = (ImageView)findViewById(R.id.img34);
        img35 = (ImageView)findViewById(R.id.img35);
        //endregion

        timer = (Chronometer)findViewById(R.id.timer);

    }

    private void methodMM(String mm) {
        String h1,h2;

        if(mm.length() == 2) {
            h1 =mm.substring(0,1);
            h2 =mm.substring(1);
        }
        else
        {
            h1 ="0";
            h2 =mm.substring(0);
        }
        int h1_int,h2_int;

        h1_int = Integer.parseInt(h1);
        h2_int = Integer.parseInt(h2);
        Log.e("values1:",String.valueOf(h1_int));
        Log.e("values2:",String.valueOf(h2_int));
        switch(h1_int)
        {
            case 0:
                img02.setBackgroundColor(color_block);
                img12.setBackgroundColor(color_block);
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block);
                break;
            case 1:
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block2);
                break;
            case 2:
                img22.setBackgroundColor(color_block2);
                img32.setBackgroundColor(color_block);
                break;
            case 3:
                img22.setBackgroundColor(color_block2);
                img32.setBackgroundColor(color_block2);
                break;
            case 4:
                img12.setBackgroundColor(color_block2);
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block);
                break;
            case 5:
                img12.setBackgroundColor(color_block2);
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block2);
                break;
            case 6:
                img12.setBackgroundColor(color_block2);
                img22.setBackgroundColor(color_block2);
                img32.setBackgroundColor(color_block);
                break;
            case 7:
                img12.setBackgroundColor(color_block2);
                img22.setBackgroundColor(color_block2);
                img32.setBackgroundColor(color_block2);
                break;
            case 8:
                img02.setBackgroundColor(color_block2);
                img12.setBackgroundColor(color_block);
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block);
                break;
            case 9:
                img02.setBackgroundColor(color_block2);
                img12.setBackgroundColor(color_block);
                img22.setBackgroundColor(color_block);
                img32.setBackgroundColor(color_block2);
                break;

        }

        switch(h2_int)
        {
            case 0:
                img03.setBackgroundColor(color_block);
                img13.setBackgroundColor(color_block);
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block);
                break;
            case 1:
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block2);
                break;
            case 2:
                img23.setBackgroundColor(color_block2);
                img33.setBackgroundColor(color_block);
                break;
            case 3:
                img23.setBackgroundColor(color_block2);
                img33.setBackgroundColor(color_block2);
                break;
            case 4:
                img13.setBackgroundColor(color_block2);
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block);
                break;
            case 5:
                img13.setBackgroundColor(color_block2);
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block2);
                break;
            case 6:
                img13.setBackgroundColor(color_block2);
                img23.setBackgroundColor(color_block2);
                img33.setBackgroundColor(color_block);
                break;
            case 7:
                img13.setBackgroundColor(color_block2);
                img23.setBackgroundColor(color_block2);
                img33.setBackgroundColor(color_block2);
                break;
            case 8:
                img03.setBackgroundColor(color_block2);
                img13.setBackgroundColor(color_block);
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block);
                break;
            case 9:
                img03.setBackgroundColor(color_block2);
                img13.setBackgroundColor(color_block);
                img23.setBackgroundColor(color_block);
                img33.setBackgroundColor(color_block2);
                break;


        }

    }

    private void methodSS(String ss) {
        String h1,h2;

        if(ss.length() == 2) {
            h1 =ss.substring(0,1);
            h2 =ss.substring(1);
        }
        else
        {
            h1 ="0";
            h2 =ss.substring(0);
        }
        int h1_int,h2_int;

        h1_int = Integer.parseInt(h1);
        h2_int = Integer.parseInt(h2);
        Log.e("values1:",String.valueOf(h1_int));
        Log.e("values2:",String.valueOf(h2_int));
        switch(h1_int)
        {
            case 0:
                img04.setBackgroundColor(color_block);
                img14.setBackgroundColor(color_block);
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block);
                break;
            case 1:
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block2);
                break;
            case 2:
                img24.setBackgroundColor(color_block2);
                img34.setBackgroundColor(color_block);
                break;
            case 3:
                img24.setBackgroundColor(color_block2);
                img34.setBackgroundColor(color_block2);
                break;
            case 4:
                img14.setBackgroundColor(color_block2);
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block);
                break;
            case 5:
                img14.setBackgroundColor(color_block2);
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block2);
                break;
            case 6:
                img14.setBackgroundColor(color_block2);
                img24.setBackgroundColor(color_block2);
                img34.setBackgroundColor(color_block);
                break;
            case 7:
                img14.setBackgroundColor(color_block2);
                img24.setBackgroundColor(color_block2);
                img34.setBackgroundColor(color_block2);
                break;
            case 8:
                img04.setBackgroundColor(color_block2);
                img14.setBackgroundColor(color_block);
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block);
                break;
            case 9:
                img04.setBackgroundColor(color_block2);
                img14.setBackgroundColor(color_block);
                img24.setBackgroundColor(color_block);
                img34.setBackgroundColor(color_block2);
                break;


        }

        switch(h2_int)
        {
            case 0:
                img05.setBackgroundColor(color_block);
                img15.setBackgroundColor(color_block);
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block);
                break;
            case 1:
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block2);
                break;
            case 2:
                img25.setBackgroundColor(color_block2);
                img35.setBackgroundColor(color_block);
                break;
            case 3:
                img25.setBackgroundColor(color_block2);
                img35.setBackgroundColor(color_block2);
                break;
            case 4:
                img15.setBackgroundColor(color_block2);
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block);
                break;
            case 5:
                img15.setBackgroundColor(color_block2);
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block2);
                break;
            case 6:
                img15.setBackgroundColor(color_block2);
                img25.setBackgroundColor(color_block2);
                img35.setBackgroundColor(color_block);
                break;
            case 7:
                img15.setBackgroundColor(color_block2);
                img25.setBackgroundColor(color_block2);
                img35.setBackgroundColor(color_block2);
                break;
            case 8:
                img05.setBackgroundColor(color_block2);
                img15.setBackgroundColor(color_block);
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block);
                break;
            case 9:
                img05.setBackgroundColor(color_block2);
                img15.setBackgroundColor(color_block);
                img25.setBackgroundColor(color_block);
                img35.setBackgroundColor(color_block2);
                break;


        }

    }


    private void methodHH(String hh) {

        String h1,h2;

        if(hh.length() == 2) {
            h1 =hh.substring(0,1);
            h2 =hh.substring(1);
        }
        else
        {
            h1 ="0";
            h2 =hh.substring(0);
        }
        int h1_int,h2_int;

        h1_int = Integer.parseInt(h1);
        h2_int = Integer.parseInt(h2);
        Log.e("values1:",String.valueOf(h1_int));
        Log.e("values2:",String.valueOf(h2_int));
        switch(h1_int)
        {
            case 0:
                img30.setBackgroundColor(color_block);
                img20.setBackgroundColor(color_block);
                break;
            case 1:
                img30.setBackgroundColor(color_block2);
                img20.setBackgroundColor(color_block);
                break;
            case 2:
                img30.setBackgroundColor(color_block);
                img20.setBackgroundColor(color_block2);
                break;

        }

        switch(h2_int)
        {
            case 0:
                img01.setBackgroundColor(color_block);
                img11.setBackgroundColor(color_block);
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block);
                break;
            case 1:
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block2);
                break;
            case 2:
                img21.setBackgroundColor(color_block2);
                img31.setBackgroundColor(color_block);
                break;
            case 3:
                img21.setBackgroundColor(color_block2);
                img31.setBackgroundColor(color_block2);
                break;
            case 4:
                img11.setBackgroundColor(color_block2);
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block);
                break;
            case 5:
                img11.setBackgroundColor(color_block2);
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block2);
                break;
            case 6:
                img11.setBackgroundColor(color_block2);
                img21.setBackgroundColor(color_block2);
                img31.setBackgroundColor(color_block);
                break;
            case 7:
                img11.setBackgroundColor(color_block2);
                img21.setBackgroundColor(color_block2);
                img31.setBackgroundColor(color_block2);
                break;
            case 8:
                img01.setBackgroundColor(color_block2);
                img11.setBackgroundColor(color_block);
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block);
                break;
            case 9:
                img01.setBackgroundColor(color_block2);
                img11.setBackgroundColor(color_block);
                img21.setBackgroundColor(color_block);
                img31.setBackgroundColor(color_block2);
                break;


        }
    }
}
