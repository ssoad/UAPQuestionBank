package com.soad.uapquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.jaeger.library.StatusBarUtil;

public class Splash extends AppCompatActivity {


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
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(Splash.this, MainActivity.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 2*1000); // wait for 5 seconds
    }
}
