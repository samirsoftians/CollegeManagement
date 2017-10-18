package com.softians.college;

import android.app.Activity;
import android.content.Intent;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class LoginActivity  extends Activity
{

    EditText t1,t2;
    Button login,registration;
    String EMAIL,PASSWORD;

    RequestQueue requestQueue5;
    int i=0;

   // String insertUrl6 = "http://ranjana.000webhostapp.com/get_login_data.php";

   /* String insertUrl6 = "http://192.168.0.4/data123/get_login_data.php";*/

   // public static final String DATA_URL21 = "http://ranjana.000webhostapp.com/samir12.php?email=";

   /* public static final String DATA_URL21 = "http://192.168.0.4/data123/samir12.php?email=";*/

    String year;
    // String name5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String name5="";

        t1= (EditText) findViewById(R.id.lname);
        t2= (EditText) findViewById(R.id.lpassword);
        login= (Button) findViewById(R.id.btnLogin);
        registration= (Button) findViewById(R.id.btnLinkToRegisterScreen);

        requestQueue5 = Volley.newRequestQueue(getApplicationContext());


        //*******************************************************************************
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

        //***********************************************************************************


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///*************************************************************************************************************

                StringRequest request1 = new StringRequest(Request.Method.POST, Constants.insertUrl6, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        if (response.trim().equals("Login Successful")) {


                            Toast.makeText(LoginActivity.this, "successfully Login", Toast.LENGTH_LONG).show();

                            EMAIL = t1.getText().toString();
                            PASSWORD = t2.getText().toString();


                            String url = Constants.DATA_URL21+ t1.getText().toString();//EtEmailAddrss1.getText().toString().trim();
///======================================================================================================================
                            StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    String name5 = "";
                                    String bname5 = "";
                                    String address5 = "";
                                    String contact5 = "";
                                    String email5 = "";
                                    String password5 = "";


                                    try {
                                        JSONObject jsonObject = new JSONObject(response);
                                        JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
                                        JSONObject collegeData = result.getJSONObject(0);
                                        name5 = collegeData.getString(Config.KEY_Y);
                                        //  bname5 = collegeData.getString(Config.KEY_B);
                                        //  address5 = collegeData.getString(Config.KEY_A);
                                        // contact5 = collegeData.getString(Config.KEY_C);
                                        // email5 = collegeData.getString(Config.KEY_E);
                                        //  password5 = collegeData.getString(Config.KEY_P);

                                        year = name5;
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                    //year=name5;
                                    switch (year) {
                                        case "FY Student":
                                        case "SY Student":
                                        case "TY Student": {
                                            Intent i = new Intent(LoginActivity.this, Student.class);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("username", t1.getText().toString());
                                            bundle.putString("year", year);
                                            i.putExtras(bundle);
                                            startActivity(i);
                                            break;
                                        }
                                        case "FY Teacher":
                                        case "SY Teacher":
                                        case "TY Teacher": {
                                            Intent i = new Intent(LoginActivity.this, Teacher.class);

                                            Bundle bundle = new Bundle();
                                            bundle.putString("username", t1.getText().toString());
                                            bundle.putString("year", year);
                                            i.putExtras(bundle);

                                            startActivity(i);
                                            break;
                                        }
                                        case "Principal": {
                                            Intent i = new Intent(LoginActivity.this, Principal.class);

                                            Bundle bundle = new Bundle();
                                            bundle.putString("username", t1.getText().toString());
                                            bundle.putString("year", year);
                                            i.putExtras(bundle);
                                            startActivity(i);
                                            break;
                                        }
                                    }


                                    //textViewResult.setText("Name:\t"+name+"\nAddress:\t" +address+ "\nVice Chancellor:\t"+ vc);
                                }
                            },
                                    new Response.ErrorListener() {
                                        @Override
                                        public void onErrorResponse(VolleyError error) {
                                            Toast.makeText(LoginActivity.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();


                                        }
                                    })

                            {

                                @Override
                                protected Map<String, String> getParams() throws AuthFailureError {
                                    Map<String, String> parameters = new HashMap<String, String>();
                                    parameters.put("email", t1.getText().toString());
                                    return parameters;
                                }
                            };


                            requestQueue5.add(stringRequest);
//=========================================================================================================================

                        } else {
                            Toast.makeText(LoginActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();


                        }


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                })
                {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("email", t1.getText().toString());
                        parameters.put("password", t2.getText().toString());

                        return parameters;
                    }
                };
                requestQueue5.add(request1);

                //************************************************************************************

            }
        });

    }
}