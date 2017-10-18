package com.softians.college;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by YogSurya on 09-03-2017.
 */
public class YearClass extends Activity
{
    Button first,second,third;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_year);

        first= (Button) findViewById(R.id.btnfirst);
        second= (Button) findViewById(R.id.btnsecond);
        third= (Button) findViewById(R.id.btnthird);


        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearClass.this,TimeTable.class);

                Bundle bundle = new Bundle();
                bundle.putString("Y",Constants.firstyear);
                bundle.putString("E",Constants.truncate1);
                i.putExtras(bundle);

                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearClass.this,TimeTable.class);

                Bundle bundle = new Bundle();
                bundle.putString("Y",Constants.secondyear);
                bundle.putString("E",Constants.truncate2);
                i.putExtras(bundle);

                startActivity(i);
            }
        });


        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(YearClass.this,TimeTable.class);

                Bundle bundle = new Bundle();
                bundle.putString("Y",Constants.thirdyear);
                bundle.putString("E",Constants.truncate3);
                i.putExtras(bundle);

                startActivity(i);
            }
        });


    }
}
