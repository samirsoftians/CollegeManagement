package com.softians.college;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Lenovo on 3/5/2017.
 */

public class TT extends AppCompatActivity {

    private ListView listView;

    int id=1;

    String myString16;



    RequestQueue requestQueue66;
    static String count="1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);// output




      requestQueue66 = Volley.newRequestQueue(getApplicationContext());




        Toast.makeText(TT.this ,myString16, Toast.LENGTH_SHORT).show();


       listView = (ListView) findViewById(R.id.listView);

        StringRequest stringRequest = new StringRequest(Constants.ParseURl_getTT, new Response.Listener<String>() {
            @Override
            public void onResponse(String response)
            {
               // Toast.makeText(TT.this ,myString16, Toast.LENGTH_SHORT).show();
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(TT.this,error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });


        requestQueue66.add(stringRequest);



    }







    private void showJSON(String json){

        ParseJSON3 pj = new ParseJSON3(json);
        pj.ParseJSON3();
       // CustomList3 cl = new CustomList3(this,ParseJSON3.times,ParseJSON3.mondays,ParseJSON3.tuesdays,ParseJSON3.wednesdays,ParseJSON3.thursdays,ParseJSON3.fridays,ParseJSON3.saturdays,ParseJSON3.count);
       //  listView.setAdapter(cl);

        //***************************************************************
        EditText f11,f22,f33,f44,f55,f66,f77;
        EditText g11,g22,g33,g44,g55,g66,g77;
        EditText h11,h22,h33,h44,h55,h66,h77;
        EditText i11,i22,i33,i44,i55,i66,i77;
        EditText j11,j22,j33,j44,j55,j66,j77;
        EditText k11,k22,k33,k44,k55,k66,k77;
        EditText l11,l22,l33,l44,l55,l66,l77;

        f11= (EditText) findViewById(R.id.F1);
        f22= (EditText) findViewById(R.id.F2);
        f33= (EditText) findViewById(R.id.F3);
        f44= (EditText) findViewById(R.id.F4);
        f55= (EditText) findViewById(R.id.F5);
        f66= (EditText) findViewById(R.id.F6);
        f77= (EditText) findViewById(R.id.F7);


        g11= (EditText) findViewById(R.id.G1);
        g22= (EditText) findViewById(R.id.G2);
        g33= (EditText) findViewById(R.id.G3);
        g44= (EditText) findViewById(R.id.G4);
        g55= (EditText) findViewById(R.id.G5);
        g66= (EditText) findViewById(R.id.G6);
        g77= (EditText) findViewById(R.id.G7);


        h11= (EditText) findViewById(R.id.H1);
        h22= (EditText) findViewById(R.id.H2);
        h33= (EditText) findViewById(R.id.H3);
        h44= (EditText) findViewById(R.id.H4);
        h55= (EditText) findViewById(R.id.H5);
        h66= (EditText) findViewById(R.id.H6);
        h77= (EditText) findViewById(R.id.H7);

        i11= (EditText) findViewById(R.id.I1);
        i22= (EditText) findViewById(R.id.I2);
        i33= (EditText) findViewById(R.id.I3);
        i44= (EditText) findViewById(R.id.I4);
        i55= (EditText) findViewById(R.id.I5);
        i66= (EditText) findViewById(R.id.I6);
        i77= (EditText) findViewById(R.id.I7);

        j11= (EditText) findViewById(R.id.J1);
        j22= (EditText) findViewById(R.id.J2);
        j33= (EditText) findViewById(R.id.J3);
        j44= (EditText) findViewById(R.id.J4);
        j55= (EditText) findViewById(R.id.J5);
        j66= (EditText) findViewById(R.id.J6);
        j77= (EditText) findViewById(R.id.J7);

        k11= (EditText) findViewById(R.id.K1);
        k22= (EditText) findViewById(R.id.K2);
        k33= (EditText) findViewById(R.id.K3);
        k44= (EditText) findViewById(R.id.K4);
        k55= (EditText) findViewById(R.id.K5);
        k66= (EditText) findViewById(R.id.K6);
        k77= (EditText) findViewById(R.id.K7);


        l11= (EditText) findViewById(R.id.L1);
        l22= (EditText) findViewById(R.id.L2);
        l33= (EditText) findViewById(R.id.L3);
        l44= (EditText) findViewById(R.id.L4);
        l55= (EditText) findViewById(R.id.L5);
        l66= (EditText) findViewById(R.id.L6);
        l77= (EditText) findViewById(R.id.L7);




        f11.setText(ParseJSON3.mondays[0]);
        f22.setText(ParseJSON3.tuesdays[0]);
        f33.setText(ParseJSON3.wednesdays[0]);
        f44.setText(ParseJSON3.thursdays[0]);
        f55.setText(ParseJSON3.fridays[0]);
        f66.setText(ParseJSON3.saturdays[0]);
        f77.setText(ParseJSON3.times[0]);





        g11.setText(ParseJSON3.mondays[1]);
        g22.setText(ParseJSON3.tuesdays[1]);
        g33.setText(ParseJSON3.wednesdays[1]);
        g44.setText(ParseJSON3.thursdays[1]);
        g55.setText(ParseJSON3.fridays[1]);
        g66.setText(ParseJSON3.saturdays[1]);
        g77.setText(ParseJSON3.times[1]);



        h11.setText(ParseJSON3.mondays[2]);
        h22.setText(ParseJSON3.tuesdays[2]);
        h33.setText(ParseJSON3.wednesdays[2]);
        h44.setText(ParseJSON3.thursdays[2]);
        h55.setText(ParseJSON3.fridays[2]);
        h66.setText(ParseJSON3.saturdays[2]);
        h77.setText(ParseJSON3.times[2]);



        i11.setText(ParseJSON3.mondays[3]);
        i22.setText(ParseJSON3.tuesdays[3]);
        i33.setText(ParseJSON3.wednesdays[3]);
        i44.setText(ParseJSON3.thursdays[3]);
        i55.setText(ParseJSON3.fridays[3]);
        i66.setText(ParseJSON3.saturdays[3]);
        i77.setText(ParseJSON3.times[3]);




        j11.setText(ParseJSON3.mondays[4]);
        j22.setText(ParseJSON3.tuesdays[4]);
        j33.setText(ParseJSON3.wednesdays[4]);
        j44.setText(ParseJSON3.thursdays[4]);
        j55.setText(ParseJSON3.fridays[4]);
        j66.setText(ParseJSON3.saturdays[4]);
        j77.setText(ParseJSON3.times[4]);


        k11.setText(ParseJSON3.mondays[5]);
        k22.setText(ParseJSON3.tuesdays[5]);
        k33.setText(ParseJSON3.wednesdays[5]);
        k44.setText(ParseJSON3.thursdays[5]);
        k55.setText(ParseJSON3.fridays[5]);
        k66.setText(ParseJSON3.saturdays[5]);
        k77.setText(ParseJSON3.times[5]);




        l11.setText(ParseJSON3.mondays[6]);
        l22.setText(ParseJSON3.tuesdays[6]);
        l33.setText(ParseJSON3.wednesdays[6]);
        l44.setText(ParseJSON3.thursdays[6]);
        l55.setText(ParseJSON3.fridays[6]);
        l66.setText(ParseJSON3.saturdays[6]);
        l77.setText(ParseJSON3.times[6]);


        //***********************************************************************************************************

 }
}
