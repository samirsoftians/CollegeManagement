package com.softians.college;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YogSurya on 03-03-2017.
 */
public class TimeTable extends Activity {

    EditText f1,f2,f3,f4,f5,f6,f7;
    EditText g1,g2,g3,g4,g5,g6,g7;
    EditText h1,h2,h3,h4,h5,h6,h7;
    EditText i1,i2,i3,i4,i5,i6,i7;
    EditText j1,j2,j3,j4,j5,j6,j7;
    EditText k1,k2,k3,k4,k5,k6,k7;
    EditText l1,l2,l3,l4,l5,l6,l7;

    Button save;

    String fy,empty;
    RequestQueue requestQueue8;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);


        Bundle bundle=null;
        bundle= this.getIntent().getExtras();
        fy=bundle.getString("Y");

        empty=bundle.getString("E");


        f1= (EditText) findViewById(R.id.F1);
        f2= (EditText) findViewById(R.id.F2);
        f3= (EditText) findViewById(R.id.F3);
        f4= (EditText) findViewById(R.id.F4);
        f5= (EditText) findViewById(R.id.F5);
        f6= (EditText) findViewById(R.id.F6);
        f7= (EditText) findViewById(R.id.F7);


        g1= (EditText) findViewById(R.id.G1);
        g2= (EditText) findViewById(R.id.G2);
        g3= (EditText) findViewById(R.id.G3);
        g4= (EditText) findViewById(R.id.G4);
        g5= (EditText) findViewById(R.id.G5);
        g6= (EditText) findViewById(R.id.G6);
        g7= (EditText) findViewById(R.id.G7);


        h1= (EditText) findViewById(R.id.H1);
        h2= (EditText) findViewById(R.id.H2);
        h3= (EditText) findViewById(R.id.H3);
        h4= (EditText) findViewById(R.id.H4);
        h5= (EditText) findViewById(R.id.H5);
        h6= (EditText) findViewById(R.id.H6);
        h7= (EditText) findViewById(R.id.H7);

        i1= (EditText) findViewById(R.id.I1);
        i2= (EditText) findViewById(R.id.I2);
        i3= (EditText) findViewById(R.id.I3);
        i4= (EditText) findViewById(R.id.I4);
        i5= (EditText) findViewById(R.id.I5);
        i6= (EditText) findViewById(R.id.I6);
        i7= (EditText) findViewById(R.id.I7);

        j1= (EditText) findViewById(R.id.J1);
        j2= (EditText) findViewById(R.id.J2);
        j3= (EditText) findViewById(R.id.J3);
        j4= (EditText) findViewById(R.id.J4);
        j5= (EditText) findViewById(R.id.J5);
        j6= (EditText) findViewById(R.id.J6);
        j7= (EditText) findViewById(R.id.J7);

        k1= (EditText) findViewById(R.id.K1);
        k2= (EditText) findViewById(R.id.K2);
        k3= (EditText) findViewById(R.id.K3);
        k4= (EditText) findViewById(R.id.K4);
        k5= (EditText) findViewById(R.id.K5);
        k6= (EditText) findViewById(R.id.K6);
        k7= (EditText) findViewById(R.id.K7);


        l1= (EditText) findViewById(R.id.L1);
        l2= (EditText) findViewById(R.id.L2);
        l3= (EditText) findViewById(R.id.L3);
        l4= (EditText) findViewById(R.id.L4);
        l5= (EditText) findViewById(R.id.L5);
        l6= (EditText) findViewById(R.id.L6);
        l7= (EditText) findViewById(R.id.L7);

        save= (Button) findViewById(R.id.samir);

        requestQueue8 = Volley.newRequestQueue(getApplicationContext());




        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //****************************************************************

                StringRequest request100 = new StringRequest(Request.Method.POST, empty, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {


                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();



                        return parameters;
                    }
                };
                requestQueue8.add(request100);

                //**********************************************************************************


                StringRequest request = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", f1.getText().toString());
                        parameters.put("tuesday", f2.getText().toString());
                        parameters.put("wednesday", f3.getText().toString());
                        parameters.put("thursday", f4.getText().toString());
                        parameters.put("friday", f5.getText().toString());
                        parameters.put("saturday", f6.getText().toString());
                        parameters.put("time", f7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request);
//=============================================================================================

                StringRequest request11 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", g1.getText().toString());
                        parameters.put("tuesday", g2.getText().toString());
                        parameters.put("wednesday", g3.getText().toString());
                        parameters.put("thursday", g4.getText().toString());
                        parameters.put("friday", g5.getText().toString());
                        parameters.put("saturday", g6.getText().toString());
                        parameters.put("time", g7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request11);
                //**********************************************************************************************************
                StringRequest request12 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", h1.getText().toString());
                        parameters.put("tuesday", h2.getText().toString());
                        parameters.put("wednesday", h3.getText().toString());
                        parameters.put("thursday", h4.getText().toString());
                        parameters.put("friday", h5.getText().toString());
                        parameters.put("saturday", h6.getText().toString());
                        parameters.put("time", h7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request12);
                //*****************************************************************
                StringRequest request13 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", i1.getText().toString());
                        parameters.put("tuesday", i2.getText().toString());
                        parameters.put("wednesday", i3.getText().toString());
                        parameters.put("thursday", i4.getText().toString());
                        parameters.put("friday", i5.getText().toString());
                        parameters.put("saturday", i6.getText().toString());
                        parameters.put("time", i7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request13);
                //****************************************************************
                StringRequest request14 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", j1.getText().toString());
                        parameters.put("tuesday", j2.getText().toString());
                        parameters.put("wednesday", j3.getText().toString());
                        parameters.put("thursday", j4.getText().toString());
                        parameters.put("friday", j5.getText().toString());
                        parameters.put("saturday", j6.getText().toString());
                        parameters.put("time", j7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request14);
                //********************************************************************
                StringRequest request15 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", k1.getText().toString());
                        parameters.put("tuesday", k2.getText().toString());
                        parameters.put("wednesday", k3.getText().toString());
                        parameters.put("thursday", k4.getText().toString());
                        parameters.put("friday", k5.getText().toString());
                        parameters.put("saturday", k6.getText().toString());
                        parameters.put("time", k7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request15);
                //*************************************************************
                StringRequest request16 = new StringRequest(Request.Method.POST, fy, new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        //  myPd_ring.dismiss();

                        Toast.makeText(TimeTable.this,"successfully inserted",Toast.LENGTH_LONG).show();

                        //**********************************

                        System.out.println(response.toString());


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("monday", l1.getText().toString());
                        parameters.put("tuesday", l2.getText().toString());
                        parameters.put("wednesday", l3.getText().toString());
                        parameters.put("thursday", l4.getText().toString());
                        parameters.put("friday", l5.getText().toString());
                        parameters.put("saturday", l6.getText().toString());
                        parameters.put("time", l7.getText().toString());


                        return parameters;
                    }
                };
                requestQueue8.add(request16);
                //************************************************************************************



            }
        });


    }
}
