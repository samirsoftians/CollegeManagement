package com.softians.college;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
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
 * Created by Lenovo on 3/5/2017.
 */

public class Attendence extends AppCompatActivity {//implements View.OnClickListener {

   // public static final String JSON_URL = "http://ranjana.000webhostapp.com/attendence.php";
 /*  public static final String JSON_URL5555 = "http://192.168.0.4/data123/attendence.php";*/
   // public static final String JSON_URL12 = "http://ranjana.000webhostapp.com/d.php";

   /* public static final String JSON_URL12 = "http://192.168.0.4/data123/d.php";*/

    Button button,dat;

    TextView tttt;
    String g;
    private ListView listView;

    RequestQueue requestQueue99;

    String url2;
    String myString4;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.at);

        button= (Button) findViewById(R.id.bat);
        dat= (Button) findViewById(R.id.bbb);

        requestQueue99 = Volley.newRequestQueue(getApplicationContext());

        tttt= (TextView) findViewById(R.id.ttt);


        listView = (ListView) findViewById(R.id.listView8);
        //  b= (Button) findViewById(R.id.button1);

//        Bundle bundle = null;
//        bundle = this.getIntent().getExtras();
//        myString4 = bundle.getString("cemail3");

        //  url2 = Config.DATA_URL2+myString4;




        //**************************************

        StringRequest stringRequest = new StringRequest(Constants.JSON_URL5555,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Attendence.this,error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************

        button.setOnClickListener(new View.OnClickListener() {
            // DatePickerFragment D=new DatePickerFragment();
            @Override
            public void onClick(View v) {

//                DialogFragment newFragment = new DatePickerFragment();
//                newFragment.show(getFragmentManager(), "DatePicker");//
                Toast.makeText(Attendence.this, "Submitted successfully", Toast.LENGTH_SHORT).show();
                //Toast.makeText(Attendence.this, tttt.getText().toString(), Toast.LENGTH_SHORT).show();


                StringRequest request102 = new StringRequest(Request.Method.POST, Constants.JSON_URL12, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //  myPd_ring.dismiss();
                        // Toast.makeText(TimeTable.this,"successfully truncated",Toast.LENGTH_LONG).show();
                        // Toast.makeText(TimeTable.this,"successfully inserted",Toast.LENGTH_LONG).show();

                        //********


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

                        parameters.put("date",tttt.getText().toString());

                        return parameters;
                    }
                };
                requestQueue99.add(request102);




                // String g=tttt.getText().toString();


                // Toast.makeText(Attendence.this, g, Toast.LENGTH_SHORT).show();
            }
        });

        dat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getFragmentManager(), "DatePicker");



//****************************************************************************


                //***********************************************************





            }
        });


    }






    private void showJSON(String json){
        samirjason pj = new samirjason(json);
        pj.samirjason();
        samirlist cl = new samirlist(this, samirjason.ids,samirjason.names);
        listView.setAdapter(cl);





    }

}
