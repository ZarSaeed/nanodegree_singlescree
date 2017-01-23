package com.example.zar.anyshop;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("H");
        String hour = df.format(date);
        int result=Integer.parseInt(hour);
        if(result >= 9 && result <=18 )
        {
            TextView myText = (TextView) findViewById(R.id.open_close_notifi_textview);
            myText.setText("Open Now");

        }
        else
        {
            TextView myText = (TextView) findViewById(R.id.open_close_notifi_textview);
            myText.setText("Closed Now");
            myText.setTextColor(Color.RED);
        }
    }
}
