package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class ParseNotice {
    public static String[] ids5;
    public static String[] names5;
    public static String[] emails5;
    public static String[] subjects5;
    public static String[] bodys5;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID5 = "id";
    public static final String KEY_NAME5 = "username";
    public static final String KEY_EMAIL5 = "year";
    public static final String KEY_SUBJECT5 = "subject";
    public static final String KEY_BODY5 = "body";


    private JSONArray users = null;

    private String json;

    public ParseNotice(String json){
        this.json = json;
    }

    protected void ParseNotice(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids5 = new String[users.length()];
            names5 = new String[users.length()];
            emails5 = new String[users.length()];
            subjects5 = new String[users.length()];
            bodys5 = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids5[i] = jo.getString(KEY_ID5);
                names5[i] = jo.getString(KEY_NAME5);
                emails5[i] = jo.getString(KEY_EMAIL5);
                subjects5[i] = jo.getString(KEY_SUBJECT5);
                bodys5[i] = jo.getString(KEY_BODY5);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
