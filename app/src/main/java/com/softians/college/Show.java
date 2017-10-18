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


public class Show extends AppCompatActivity {//implements View.OnClickListener {

    //public static final String JSON_URL2 = "http://ranjana.000webhostapp.com/show.php";

  /*  public static final String JSON_URL2 = "http://192.168.0.4/data123/show.php";*/

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showleave1);


        listView1 = (ListView) findViewById(R.id.listView1);


        //**************************************

        StringRequest stringRequest = new StringRequest(Constants.JSON_URL2,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Show.this,error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************
    }






    private void showJSON(String json){
        ParseJSON4 pj = new ParseJSON4(json);
        pj.parseJSON4();
        CustomList4 cl = new CustomList4(this, ParseJSON4.ids4,ParseJSON4.names4,ParseJSON4.emails4,ParseJSON4.subjects4,ParseJSON4.bodys4);
        listView1.setAdapter(cl);

    }


}
