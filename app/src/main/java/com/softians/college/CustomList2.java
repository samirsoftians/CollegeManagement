package com.softians.college;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class CustomList2 extends ArrayAdapter<String> {
    private String[] ids1;
    private String[] names1;
    private String[] emails1;
    private String[] subjects1;
   // private String[] bodys1;
    private Activity context;

    public CustomList2(Activity context, String[] ids1, String[] names1, String[] emails1, String[] subjects1) {
        super(context, R.layout.display, ids1);
        this.context = context;
        this.ids1 = ids1;
        this.names1 = names1;
        this.emails1 = emails1;
        this.subjects1 = subjects1;
     //   this.bodys1 = bodys1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.display, null, true);

       // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.tName);
        TextView Subjects1 = (TextView) listViewItem.findViewById(R.id.tSubject);


        //textViewId.setText(ids[position]);
        textViewName.setText(names1[position]);
       // textViewEmail.setText(emails[position]);
        Subjects1.setText(subjects1[position]);


        return listViewItem;
    }
}
