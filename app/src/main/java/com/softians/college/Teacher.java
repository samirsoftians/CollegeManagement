package com.softians.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by YogSurya on 03-03-2017.
 */
public class Teacher extends Activity {


    Button attendace,notice,addleave,showleave,shnotice;

    String ts5,ts6;
    Bundle bundle = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.teacher);

        attendace= (Button) findViewById(R.id.attendace);
        notice= (Button) findViewById(R.id.notice);
        addleave= (Button) findViewById(R.id.tleave);
       showleave= (Button) findViewById(R.id.showleave);
        shnotice= (Button) findViewById(R.id.tsnotice);


        bundle = this.getIntent().getExtras();
        ts5 = bundle.getString("username");
        ts6 = bundle.getString("year");



        attendace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Teacher.this,Attendence.class);
                startActivity(i);
            }
        });

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Teacher.this,Notice.class);

                Bundle bundle = new Bundle();
                bundle.putString("username", ts5);
                bundle.putString("year", ts6);
                i.putExtras(bundle);
                startActivity(i);
            }
        });


        addleave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Teacher.this,Leave.class);

                Bundle bundle = new Bundle();
                bundle.putString("username", ts5);
                bundle.putString("year", ts6);
                i.putExtras(bundle);

                startActivity(i);
            }
        });



        showleave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Teacher.this,Showleave.class);
                startActivity(i);
            }
        });

        shnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Teacher.this,Shownotice.class);
                startActivity(i);

            }
        });



    }
}
