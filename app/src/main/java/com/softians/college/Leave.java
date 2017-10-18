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
public class Leave extends Activity
{
    Button submit;
    EditText subject,body;
    TextView tvs,tvb;


    String s3,s4;
    Bundle bundle = null;

    RequestQueue  requestQueue1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_leave);

        submit= (Button) findViewById(R.id.btnsubmit);
        subject= (EditText) findViewById(R.id.edsubject);
        body= (EditText) findViewById(R.id.edbody);
        tvs= (TextView) findViewById(R.id.txtsubject);
        tvb= (TextView) findViewById(R.id.txtbody);


        requestQueue1 = Volley.newRequestQueue(getApplicationContext());

        bundle = this.getIntent().getExtras();
        s3 = bundle.getString("username");
        s4 = bundle.getString("year");


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringRequest request = new StringRequest(Request.Method.POST, Constants.ParseURl_addleave, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //  myPd_ring.dismiss();
                        Toast.makeText(Leave.this, "Succefully Inserted", Toast.LENGTH_SHORT).show();
//=========================================================================================================================

//                        if((s4.equals("FY Student"))||(s4.equals("SY Student"))||(s4.equals("TY Student")))
//                        {
//                            Intent i = new Intent(Leave.this,Student.class);
//                            startActivity(i);
//                        }
//
//                        else  if((s4.equals("FY Teacher"))||(s4.equals("SY Teacher"))||(s4.equals("TY Teacher")))
//                        {
//                            Intent i = new Intent(Leave.this,Teacher.class);
//                            startActivity(i);
//                        }
//                        else
//                        {
//                            Intent i = new Intent(Leave.this,Principal.class);
//                            startActivity(i);
//                        }



//=================================================================================================================
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
                        parameters.put("username", s3);
                        parameters.put("year", s4);
                        parameters.put("subject", subject.getText().toString());
                        parameters.put("body", body.getText().toString());

                        return parameters;
                    }
                };
                requestQueue1.add(request);

            }
        });

    }
}
