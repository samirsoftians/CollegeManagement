package com.softians.college;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by YogSurya on 03-03-2017.
 */
public class Syllabus extends LoginActivity {

    Button upload,download;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_syllabus);

        upload= (Button) findViewById(R.id.btn_upload);
        download = (Button) findViewById(R.id.btn_download);


//        upload.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//
//                Intent intent =new Intent(Syllabus.this,MainActivity3.class);
//                startActivity(intent);
////                if ((year.equals("FY Student"))||(year.equals("SY Student"))||(year.equals("TY Student")))
////                {
////                    // Toast.makeText(Syllabus.this, "Sorry,You are not Authorized", Toast.LENGTH_SHORT).show();
////                }
////               else if ((year.equals("Principal")))
////                {
////                    Toast.makeText(Syllabus.this, "Plz select file", Toast.LENGTH_SHORT).show();
////                }
//
//            }
//        });


        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(Syllabus.this, "Downloading...", Toast.LENGTH_SHORT).show();



            }
        });
    }

//===============================================================================================================



//===============================================================================================================



    }

