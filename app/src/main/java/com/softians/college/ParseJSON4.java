package com.softians.college;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class ParseJSON4 {
    public static String[] ids4;
    public static String[] names4;
    public static String[] emails4;
    public static String[] subjects4;
    public static String[] bodys4;

    public static final String JSON_ARRAY = "result";
    public static final String KEY_ID4 = "id";
    public static final String KEY_NAME4 = "username";
    public static final String KEY_EMAIL4 = "year";
    public static final String KEY_SUBJECT4 = "subject";
    public static final String KEY_BODY4 = "body";


    private JSONArray users = null;

    private String json;

    public ParseJSON4(String json){
        this.json = json;
    }

    protected void parseJSON4(){
        JSONObject jsonObject=null;
        try {
            jsonObject = new JSONObject(json);
            users = jsonObject.getJSONArray(JSON_ARRAY);

            ids4 = new String[users.length()];
            names4 = new String[users.length()];
            emails4 = new String[users.length()];
            subjects4 = new String[users.length()];
            bodys4 = new String[users.length()];

            for(int i=0;i<users.length();i++){
                JSONObject jo = users.getJSONObject(i);
                ids4[i] = jo.getString(KEY_ID4);
                names4[i] = jo.getString(KEY_NAME4);
                emails4[i] = jo.getString(KEY_EMAIL4);
                subjects4[i] = jo.getString(KEY_SUBJECT4);
                bodys4[i] = jo.getString(KEY_BODY4);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
