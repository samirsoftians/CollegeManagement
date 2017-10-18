package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class ParseNoticeStud {
    public static String[] ids6;
    public static String[] names6;
    public static String[] emails6;
    public static String[] subjects6;
    public static String[] bodys6;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID6 = "id";
    public static final String KEY_NAME6 = "username";
    public static final String KEY_EMAIL6 = "year";
    public static final String KEY_SUBJECT6 = "subject";
    public static final String KEY_BODY6 = "body";


    private JSONArray users = null;

    private String json;

    public ParseNoticeStud(String json){
        this.json = json;
    }

    protected void ParseNoticeStud(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids6 = new String[users.length()];
            names6 = new String[users.length()];
            emails6 = new String[users.length()];
            subjects6 = new String[users.length()];
            bodys6 = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids6[i] = jo.getString(KEY_ID6);
                names6[i] = jo.getString(KEY_NAME6);
                emails6[i] = jo.getString(KEY_EMAIL6);
                subjects6[i] = jo.getString(KEY_SUBJECT6);
                bodys6[i] = jo.getString(KEY_BODY6);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
