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
public class Shownotice extends Activity
{
    private ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shownotice);

        LV= (ListView) findViewById(R.id.listnotice);

        //***********************************************************


        StringRequest stringRequest = new StringRequest(Constants.ParseURl_getnotice,new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Shownotice.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************

    }

    private void showJSON(String json){
        ParseNotice pj = new ParseNotice(json);
        pj.ParseNotice();
        CustomList5 cl = new CustomList5(this, ParseNotice.ids5,ParseNotice.names5,ParseNotice.emails5,ParseNotice.subjects5,ParseNotice.bodys5);
        LV.setAdapter(cl);

    }



}
