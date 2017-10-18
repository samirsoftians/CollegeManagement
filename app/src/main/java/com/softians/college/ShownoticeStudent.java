package com.softians.college;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by YogSurya on 08-03-2017.
 */
public class  ShownoticeStudent extends Activity
{
    private ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shownotice1);

        LV= (ListView) findViewById(R.id.listnotice1);

        //***********************************************************


        StringRequest stringRequest = new StringRequest(Constants.ParseURl_getnotice_t,new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(ShownoticeStudent.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************

    }

    private void showJSON(String json){
        ParseNoticeStud pj = new ParseNoticeStud(json);
        pj.ParseNoticeStud();
        CustomList6 cl = new CustomList6(this, ParseNoticeStud.ids6,ParseNoticeStud.names6,ParseNoticeStud.emails6,ParseNoticeStud.subjects6,ParseNoticeStud.bodys6);
        LV.setAdapter(cl);

    }



}
