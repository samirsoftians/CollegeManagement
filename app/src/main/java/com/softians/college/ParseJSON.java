package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class ParseJSON {
    public static String[] ids;
    public static String[] names;
    public static String[] emails;
    public static String[] subjects;
    public static String[] bodys;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "username";
    public static final String KEY_EMAIL = "year";
    public static final String KEY_SUBJECT = "subject";
    public static final String KEY_BODY = "body";


    private JSONArray users = null;

    private String json;

    public ParseJSON(String json){
        this.json = json;
    }

    protected void parseJSON(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids = new String[users.length()];
            names = new String[users.length()];
            emails = new String[users.length()];
            subjects = new String[users.length()];
            bodys = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids[i] = jo.getString(KEY_ID);
                names[i] = jo.getString(KEY_NAME);
                emails[i] = jo.getString(KEY_EMAIL);
                subjects[i] = jo.getString(KEY_SUBJECT);
                bodys[i] = jo.getString(KEY_BODY);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
