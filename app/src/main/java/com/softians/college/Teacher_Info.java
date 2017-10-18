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
 * Created by YogSurya on 04-03-2017.
 */
public class Teacher_Info extends Activity {

    //public static final String JSON_URL3 = "http://ranjana.000webhostapp.com/teacher.php";

    /*public static final String JSON_URL3 = "http://192.168.0.4/data123/teacher.php";*/

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_info);

        lv= (ListView) findViewById(R.id.info);

        //**************************************

        StringRequest stringRequest = new StringRequest(Constants.JSON_URL3,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        showJSON(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Teacher_Info.this, error.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //**************************************
    }






    private void showJSON(String json){
        ParseJSON2 pj = new ParseJSON2(json);
        pj.parseJSON2();
        CustomList2 cl = new CustomList2(this, ParseJSON2.ids1,ParseJSON2.names1,ParseJSON2.emails1,ParseJSON2.subjects1);
        lv.setAdapter(cl);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            public void onItemClick(AdapterView<?> arg0, View arg1,int arg2, long arg3)
//            {
//                /*String str = ((TextView) arg1).getText().toString();
//                Toast.makeText(getBaseContext(),str, Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(getBaseContext(),your_new_Intent.class);
//                intent.putExtra("list_view_value", str);
//                startActivity(intent);*/
//            }
//        });
    }


}
