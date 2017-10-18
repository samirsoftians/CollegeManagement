package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 3/5/2017.
 */

public class ParseJSON3 {

   // public static String[] ids;
    public static String[] times;
    public static String[] mondays;
    public static String[] tuesdays;
    public static String[] wednesdays;
    public static String[] thursdays;
    public static String[] fridays;
    public static String[] saturdays;

    public static String[] count={"1"};

    public static final String JSON_ARRAY = "result";
  // public static final String KEY_ID = "id";
    public static final String KEY_TIME = "time";
    public static final String KEY_MONDAY = "monday";
    public static final String KEY_TUESDAY = "tuesday";
    public static final String KEY_WEDNESDAY = "wednesday";
    public static final String KEY_THURSDAY = "thursday";
    public static final String KEY_FRIDAY = "friday";
    public static final String KEY_SATURDAY = "saturday";


    private JSONArray users = null;

    private String json;

    public ParseJSON3(String json){
        this.json = json;
    }

    protected void ParseJSON3(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

          // ids = new String[users.length()];
            count = new String[users.length()];
            times = new String[users.length()];
            mondays = new String[users.length()];
            tuesdays = new String[users.length()];
            wednesdays = new String[users.length()];
            thursdays = new String[users.length()];
            fridays = new String[users.length()];
            saturdays = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
              // ids[i] = jo.getString(KEY_ID);
                times[i] = jo.getString(KEY_TIME);
                mondays[i] = jo.getString(KEY_MONDAY);
                tuesdays[i] = jo.getString(KEY_TUESDAY);
                wednesdays[i] = jo.getString(KEY_WEDNESDAY);
                thursdays[i] = jo.getString(KEY_THURSDAY);
                fridays[i] = jo.getString(KEY_FRIDAY);
                saturdays[i] = jo.getString(KEY_SATURDAY);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
