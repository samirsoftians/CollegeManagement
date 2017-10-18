package com.softians.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by YogSurya on 03-03-2017.
 */
public class Principal extends Activity {

    Button pnotice,pupload,psleave,settt;

    String ps1,ps2;
    Bundle bundle = null;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.principal);

        pnotice= (Button) findViewById(R.id.pnotice);
        pupload= (Button) findViewById(R.id.upsyllabus);
        psleave= (Button) findViewById(R.id.pleave);
        settt= (Button) findViewById(R.id.settimetable);


        bundle = this.getIntent().getExtras();
        ps1 = bundle.getString("username");
        ps2 = bundle.getString("year");

        pnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Principal.this,Notice.class);

                Bundle bundle = new Bundle();
                bundle.putString("username", ps1);
                bundle.putString("year", ps2);
                i.putExtras(bundle);
                startActivity(i);

            }
        });


        pupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Principal.this,Getdata.class);
                startActivity(i);

            }
        });



        psleave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Principal.this,Show.class);
                startActivity(i);

            }
        });



        settt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Principal.this,YearClass.class);
                startActivity(i);

            }
        });








    }
}
