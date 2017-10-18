package com.softians.college;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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
 * Created by Lenovo on 3/2/2017.
 */

public class RegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String TAG = "RegisterActivity";

    public String mName,mEmail,mPassword,msubject;

    EditText edname,edmail,edpassword,edsubject;
    Button btnRegister,btnbacktologin;
    Spinner spinner;

    RequestQueue requestQueue1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edname=(EditText)findViewById(R.id.name);
        edmail=(EditText)findViewById(R.id.email);
        edpassword=(EditText)findViewById(R.id.password);
        edsubject=(EditText)findViewById(R.id.subject);

        btnRegister=(Button)findViewById(R.id.btnRegister);
        btnbacktologin=(Button)findViewById(R.id.btnLinkToLoginScreen);

        requestQueue1 = Volley.newRequestQueue(getApplicationContext());


        String[] SPINNERLIST = {UserType.FY_Student.toString(), UserType.SY_Student.toString(), UserType.TY_Student.toString(),
                UserType.FY_Teacher.toString(),UserType.SY_Teacher.toString(),UserType.TY_Teacher.toString(),UserType.Principal.toString()};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item,SPINNERLIST);

        spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                edsubject.setEnabled(true);
                Log.d(TAG, "onItemSelected: Position" + position);
                Log.d(TAG, "onItemClick: Position:"+position);

                if (position == 0) {
                    Constants.type = Constants.FY_Student;
                    edsubject.setEnabled(false);
                } else if (position == 1) {
                    Constants.type = Constants.SY_Student;
                    edsubject.setEnabled(false);

                } else if (position == 2) {
                    Constants.type = Constants.TY_Student;
                    edsubject.setEnabled(false);

                } else if (position == 3) {
                    Constants.type = Constants.FY_Teacher;
                } else if (position == 4) {
                    Constants.type = Constants.SY_Teacher;
                } else if (position == 5) {
                    Constants.type = Constants.TY_Teacher;
                }  else if (position == 6) {
                    Constants.type = Constants.Principal;
                    edsubject.setEnabled(false);

                }

                Log.d(TAG, "onItemSelected: Constants Type:"+Constants.type);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                Toast.makeText(RegisterActivity.this, "Please Select..", Toast.LENGTH_SHORT).show();
            }
        });

//***********************************************************************************************
        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                GetDataFromEditText();

                if (TextUtils.isEmpty(mName) || TextUtils.isEmpty(mEmail) || TextUtils.isEmpty(mPassword)) {
//                    edtext.setError("");
//                    edwritten.setError("");
                    Toast.makeText(RegisterActivity.this, "PLEASE TYPE SOMETHING...", Toast.LENGTH_LONG).show();

                    return;
                }
                else
                {
                    Log.d(TAG, "doInBackground: Values in Click: "+mName+mEmail+mPassword+msubject+Constants.type);
                    //SendDataToServer(mName, mEmail, mPassword,msubject);

//******************************************************
                    final ProgressDialog myPd_ring = ProgressDialog.show(RegisterActivity.this, "Please wait", "Uploading Data.....", true);
                    myPd_ring.setCancelable(true);
                    new Thread(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            // TODO Auto-generated method stub
                            try
                            {
                                //Thread.sleep(10000);
                            } catch (Exception e)
                            {

                            }
                            //myPd_ring.dismiss();
                        }
                    }).start();
                    //***********************************************************************************************

                    StringRequest request = new StringRequest(Request.Method.POST, Constants.ParseURl_Register, new Response.Listener<String>()
                    {
                        @Override
                        public void onResponse(String response) {
                             myPd_ring.dismiss();


                            //if(response.trim().equals("Success"))
                            //{

                                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                                startActivity(intent);
                                //yPd_ring.dismiss();

                                //Toast.makeText(.this, "Success", Toast.LENGTH_SHORT).show();
                                //edname.setError("Email already Exist");
                            //}
                           // else
                           // {
                                //*************************************************************************

                              //  Toast.makeText(RegisterActivity.this, "unSuccess", Toast.LENGTH_SHORT).show();


                                //*******************************************************************************************
                           // }

                            Toast.makeText(RegisterActivity.this,"Data Uploaded Successfully",Toast.LENGTH_LONG).show();

//=========================================================================================================================


                            //System.out.println(response.toString());


                        }
                    }, new Response.ErrorListener()
                    {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    })
                    {

                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> parameters = new HashMap<String, String>();
                            parameters.put("name",edname.getText().toString());
                            parameters.put("email", edmail.getText().toString());
                            parameters.put("password", edpassword.getText().toString());
                            parameters.put("subject", edsubject.getText().toString());
                            parameters.put("year", Constants.type);



                            return parameters;
                        }
                    };
                    requestQueue1.add(request);
                    myPd_ring.dismiss();


                    //**************************************************************************************************

                }


            }

        });

        btnbacktologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    public void GetDataFromEditText(){

        mName = edname.getText().toString();
        mEmail = edmail.getText().toString();
        mPassword=edpassword.getText().toString();
        msubject=edsubject.getText().toString();



    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
