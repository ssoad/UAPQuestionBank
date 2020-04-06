package com.soad.uapquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_about);
        TextView ab= (TextView) findViewById(R.id.ab);
        TextView about = (TextView) findViewById(R.id.about);
        about.setText("This app is developed for Students of University of Asia Pacific to store all question paper at one place.");

    }
}
