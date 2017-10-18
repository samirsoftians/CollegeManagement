package com.softians.college;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class Showleave extends AppCompatActivity {//implements View.OnClickListener {

   // public static final String JSON_URL = "http://ranjana.000webhostapp.com/fetch.php";

   /* public static final String JSON_URL = "http://192.168.0.4/data123/fetch.php";*/

    //private Button buttonGet;

    private ListView listView;

    String url2;
    String myString4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showleave);


        listView = (ListView) findViewById(R.id.listView);

//        Bundle bundle = null;
//        bundle = this.getIntent().getExtras();
//        myString4 = bundle.getString("cemail3");

        // url2 = Config.DATA_URL2+myString4;


        //**************************************

        StringRequest stringRequest = new StringRequest(Constants.JSON_URL,new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Showleave.this,error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************
    }






    private void showJSON(String json){
        ParseJSON pj = new ParseJSON(json);
        pj.parseJSON();
        CustomList cl = new CustomList(this, ParseJSON.ids,ParseJSON.names,ParseJSON.emails,ParseJSON.subjects,ParseJSON.bodys);
        listView.setAdapter(cl);

    }


}
