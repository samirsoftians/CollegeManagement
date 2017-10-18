package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class ParseJSON2 {
    public static String[] ids1;
    public static String[] names1;
    public static String[] emails1;
    public static String[] subjects1;
   // public static String[] bodys1;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID1 = "id";
    public static final String KEY_NAME1 = "name";
    public static final String KEY_EMAIL1 = "year";
    public static final String KEY_SUBJECT1 = "subject";
  //  public static final String KEY_BODY1 = "body";


    private JSONArray users = null;

    private String json;

    public ParseJSON2(String json){
        this.json = json;
    }

    protected void parseJSON2(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids1 = new String[users.length()];
            names1 = new String[users.length()];
            emails1 = new String[users.length()];
            subjects1 = new String[users.length()];
            //bodys1 = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids1[i] = jo.getString(KEY_ID1);
                names1[i] = jo.getString(KEY_NAME1);
                emails1[i] = jo.getString(KEY_EMAIL1);
                subjects1[i] = jo.getString(KEY_SUBJECT1);
               // bodys1[i] = jo.getString(KEY_BODY1);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
