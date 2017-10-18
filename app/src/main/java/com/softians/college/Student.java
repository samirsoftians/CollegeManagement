package com.softians.college;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by YogSurya on 03-03-2017.
 */
public class Student extends Activity
{
    Button syllabus,timetable,leave,structure,teacherinfo,msbte,shownotice;

    String s1,s2;
    Bundle bundle = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);

        syllabus= (Button) findViewById(R.id.syllabus);
        timetable= (Button) findViewById(R.id.timetable);
        leave= (Button) findViewById(R.id.sleave);
        structure= (Button) findViewById(R.id.college);
        teacherinfo= (Button) findViewById(R.id.teacherinfo);
        msbte= (Button) findViewById(R.id.msbte);
        shownotice= (Button) findViewById(R.id.shownotice);

        bundle = this.getIntent().getExtras();
        s1 = bundle.getString("username");
        s2 = bundle.getString("year");


        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student.this,Getdata_stud.class);
                startActivity(i);
            }
        });




        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(s2.equals("FY Student"))
                {
                    Intent i = new Intent(Student.this,TT.class);
                    startActivity(i);
                }
                else if(s2.equals("SY Student"))
                {
                    Intent i = new Intent(Student.this,TTT.class);
                    startActivity(i);
                }
                else if(s2.equals("TY Student"))
                {
                    Intent i = new Intent(Student.this,TTTT.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(Student.this, "not a student", Toast.LENGTH_SHORT).show();
                }


            }
        });


        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student.this,Leave.class);
                Bundle bundle = new Bundle();
                bundle.putString("username", s1);
                bundle.putString("year", s2);
                i.putExtras(bundle);


                startActivity(i);
            }
        });

        structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student.this,Structure.class);
                startActivity(i);
            }
        });

        teacherinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Student.this,Teacher_Info.class);
                startActivity(i);
            }
        });

        msbte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.msbte.com/"));
                startActivity(intent);
            }
        });


        shownotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Student.this,ShownoticeStudent.class);
                startActivity(i);

            }
        });

    }
}
