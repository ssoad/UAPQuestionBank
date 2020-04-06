package com.soad.uapquestionbank.eee;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jaeger.library.StatusBarUtil;
import com.soad.uapquestionbank.Constants;
import com.soad.uapquestionbank.R;
import com.soad.uapquestionbank.Upload;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class ViewQuestion_EEE_Sixth extends AppCompatActivity {
    //the listview
    ListView listView;

    //database reference to get uploads data
    DatabaseReference mDatabaseReference;

    //list to store uploads data
    List<Upload> uploadList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_view_questions);
        uploadList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listview);
        TextView dept_view = (TextView) findViewById(R.id.dept_view);
        TextView sem_view = (TextView) findViewById(R.id.sem_view);
        TextView sp2 = (TextView) findViewById(R.id.sp2);


        dept_view.setText("Electrical and Electronics Engineering");
        sem_view.setText("Sixth Semester");



        // String[] countryArray = {"India", "Pakistan", "USA", "UK"};
        //ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview,R.id.textView,);
        // ListView listView = (ListView) findViewById(R.id.listview);
        //sem_view.setText(Constants.DATABASE_PATH_UPLOADS+"/"+Constants.questions.getFile_name()+"/"+Constants.questions.getSem_format()+"/");



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //getting the upload
                Upload upload = uploadList.get(i);

                //Opening the upload file in browser using the upload url
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(upload.getUrl()));
                startActivity(intent);
            }
        });




        //getting the database reference
        mDatabaseReference = FirebaseDatabase.getInstance().getReference(Constants.DATABASE_PATH_UPLOADS+"/EEE/3-2");

        //retrieving upload data from firebase database
        mDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Upload upload = postSnapshot.getValue(Upload.class);
                    uploadList.add(upload);

                }

                String[] uploads = new String[uploadList.size()];

                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = uploadList.get(i).getName();
                }
                //displaying it to list
                ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_listview,R.id.textView,uploads);
                listView.setAdapter(adapter);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}

