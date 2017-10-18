package com.softians.college;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
 * Created by YogSurya on 03-03-2017.
 */
public class Notice extends Activity {


    Button submit;
    EditText esubject,ebody;
    TextView tvsub,tvbody;

    String ns1,ns2;
    Bundle bundle = null;

    RequestQueue requestQueue2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_notice);

        submit= (Button) findViewById(R.id.submit);
        esubject= (EditText) findViewById(R.id.eddsubject);
        ebody= (EditText) findViewById(R.id.eddbody);
        tvsub= (TextView) findViewById(R.id.textsubject);
        tvbody= (TextView) findViewById(R.id.textbody);

        requestQueue2 = Volley.newRequestQueue(getApplicationContext());

        bundle = this.getIntent().getExtras();
        ns1 = bundle.getString("username");
        ns2 = bundle.getString("year");



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //========================================================================================
                StringRequest request = new StringRequest(Request.Method.POST, Constants.ParseURl_addnotice, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //  myPd_ring.dismiss();
                        Toast.makeText(Notice.this, "Succefully Inserted", Toast.LENGTH_SHORT).show();
//=========================================================================================================================
//                        if((ns2.equals("FY Teacher"))||(ns2.equals("SY Teacher"))||(ns2.equals("TY Teacher")))
//                        {
//                            Intent i = new Intent(Notice.this,Teacher.class);
//                            startActivity(i);
//                        }
//                        else
//                        {
//                            Intent i = new Intent(Notice.this,Principal.class);
//                            startActivity(i);
//                        }

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
                        parameters.put("username", ns1);
                        parameters.put("year", ns2);
                        parameters.put("subject", esubject.getText().toString());
                        parameters.put("body", ebody.getText().toString());

                        return parameters;
                    }
                };
                requestQueue2.add(request);





                //===================================================================================

            }
        });


    }
}
