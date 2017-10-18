package com.softians.college;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
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

public class samirlist extends  ArrayAdapter<String> {
    private String[] ids;
    private String[] names;
    private Activity context;

    String m;

  //  String n;

   // public static final String JSON_URL10 = "http://ranjana.000webhostapp.com/p.php";

    /*public static final String JSON_URL10 = "http://192.168.0.4/data123/p.php";
    public static final String JSON_URL11 = "http://192.168.0.4/data123/a.php";*/

    //String m;

    String present[]=new String[500];


    RequestQueue requestQueue9;

    public samirlist(Activity context, String[] ids, String[] names) {
        super(context, R.layout.outpur2, ids);
        this.context = context;
        this.ids = names;
        this.names = names;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {


        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.outpur2, null, true);


        requestQueue9 = Volley.newRequestQueue(context);


        // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        CheckBox textViewName = (CheckBox) listViewItem.findViewById(R.id.checkBox);
        //TextView textViewName2 = (TextView) listViewItem.findViewById(R.id.textView2);


        textViewName.setText(names[position]);


//textViewName.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        CheckBox cb = (CheckBox) v.findViewById(R.id.checkBox);
//        String m= (String) cb.getText();
//        Toast.makeText(context,m, Toast.LENGTH_LONG).show();
//    }
//});


        textViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v.findViewById(R.id.checkBox);
               final String n = (String) cb.getText();
                m=n;

                //String m= (String) cb.getText();

                if (cb.isChecked()) {
                  //  n=m;
                    Toast.makeText(context, n + "-" + "present", Toast.LENGTH_SHORT).show();

                    StringRequest request101 = new StringRequest(Request.Method.POST, Constants.JSON_URL10, new Response.Listener<String>() {
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

                            parameters.put("present",m);

                            return parameters;
                        }
                    };
                    requestQueue9.add(request101);

                }

                else
                {

                    //n=m;
                    Toast.makeText(context, n + "-" + "absent", Toast.LENGTH_SHORT).show();


                    //**********************************************************

                    StringRequest request102 = new StringRequest(Request.Method.POST, Constants.JSON_URL11, new Response.Listener<String>() {
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

                            parameters.put("absent",m);

                            return parameters;
                        }
                    };
                    requestQueue9.add(request102);
                    //********************************************************
                }

            }
        });


        return listViewItem;


        //************************************************

    }


}
