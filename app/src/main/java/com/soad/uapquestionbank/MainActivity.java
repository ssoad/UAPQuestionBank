package com.soad.uapquestionbank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.jaeger.library.StatusBarUtil;



public class MainActivity extends AppCompatActivity {


    public static void buttonEffect(View button){
        button.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(Color.rgb(255, 56, 131), PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_main);




        TextView time = (TextView) findViewById(R.id.time);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY");
        String currentDateandTime = sdf.format(new Date());
        time.setText("Today: "+currentDateandTime);
        Button QuesBank = (Button) findViewById(R.id.QuesBank);
        Button Contribute = (Button) findViewById(R.id.contribute);
        Button about = (Button) findViewById(R.id.about);
        Button suggestion = (Button) findViewById(R.id.suggestion);
        QuesBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonEffect(v);
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

        Contribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonEffect(v);
                Intent i = new Intent(MainActivity.this,FileUpload.class);
                startActivity(i);
            }
        });


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonEffect(v);
                Intent i = new Intent(MainActivity.this,About.class);
                startActivity(i);
            }
        });

        suggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonEffect(v);
                Intent i = new Intent(MainActivity.this,Suggestion.class);
                startActivity(i);
            }
        });


    }
}
