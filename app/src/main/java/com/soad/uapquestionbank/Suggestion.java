package com.soad.uapquestionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jaeger.library.StatusBarUtil;

public class Suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_suggestion);
        TextView ab = (TextView) findViewById(R.id.ab);
        TextView sugg = (TextView) findViewById(R.id.sugg);
        TextView name = (TextView) findViewById(R.id.name);
        TextView dept = (TextView) findViewById(R.id.dept);
        ImageView whatsapp = (ImageView) findViewById(R.id.whatsapp);
        ImageView gmail = (ImageView) findViewById(R.id.gmail);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contact = "+8801725683936"; // use country code with your phone number
                String url = "https://api.whatsapp.com/send?phone=" + contact;
                try {
                    PackageManager pm = getBaseContext().getPackageManager();
                    pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(Suggestion.this, "Whatsapp app not installed in your phone", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });


        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                String[] recipients={"mdsoad@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT,"UAP Question Bank");
                //intent.putExtra(Intent.EXTRA_TEXT,"Body of the content here...");
              //  intent.putExtra(Intent.EXTRA_CC,"mailcc@gmail.com");
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });



    }
}
