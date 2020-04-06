package com.soad.uapquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jaeger.library.StatusBarUtil;
import com.soad.uapquestionbank.archi.Semester_ARCHI;
import com.soad.uapquestionbank.civil.Semester_CIVIL;
import com.soad.uapquestionbank.cse.Semester_CSE;
import com.soad.uapquestionbank.dba.Semester_DBA;
import com.soad.uapquestionbank.eee.Semester_EEE;
import com.soad.uapquestionbank.eng.Semester_ENG;
import com.soad.uapquestionbank.law.Semester_LAW;
import com.soad.uapquestionbank.pharm.Semester_PHARM;

public class Home extends AppCompatActivity {
    //public static Questions questions = null;
    //public static String dept= null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        StatusBarUtil.setTransparent(this);


        ImageView arch = (ImageView) findViewById(R.id.arch);
        ImageView cse = (ImageView) findViewById(R.id.cse);
        ImageView bba = (ImageView) findViewById(R.id.bba);
        ImageView eee = (ImageView) findViewById(R.id.eee);
        ImageView civil = (ImageView) findViewById(R.id.civil);
        ImageView eng = (ImageView) findViewById(R.id.eng);
        ImageView law = (ImageView) findViewById(R.id.law);
        ImageView pharm = (ImageView) findViewById(R.id.pharm);

        arch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Constants.questions.setDept("Architecture");
                Intent intent = new Intent(Home.this, Semester_ARCHI.class);
                startActivity(intent);
            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Computer Science and Engineering");
                Intent intent = new Intent(Home.this, Semester_CSE.class);
                startActivity(intent);
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Electrical and Electronics Engineering");
                Intent intent = new Intent(Home.this, Semester_EEE.class);
                startActivity(intent);
            }
        });

        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Business Administration");
                Intent intent = new Intent(Home.this, Semester_DBA.class);
                startActivity(intent);
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Civil Enigineering");
                Intent intent = new Intent(Home.this, Semester_CIVIL.class);
                startActivity(intent);
            }
        });

        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions =new Questions("English",1);
                Intent intent = new Intent(Home.this, Semester_ENG.class);
                startActivity(intent);
            }
        });

        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Law");
                Intent intent = new Intent(Home.this, Semester_LAW.class);
                startActivity(intent);
            }
        });


        pharm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Constants.questions.setDept("Pharmacy");
                Intent intent = new Intent(Home.this, Semester_PHARM.class);
                startActivity(intent);
            }
        });





    }
}
