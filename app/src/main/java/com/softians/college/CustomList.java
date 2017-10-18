package com.softians.college;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class CustomList extends ArrayAdapter<String> {
    private String[] ids;
    private String[] names;
    private String[] emails;
    private String[] subjects;
    private String[] bodys;
    private Activity context;

    public CustomList(Activity context, String[] ids, String[] names, String[] emails, String[] subjects, String[] bodys) {
        super(context, R.layout.display2, ids);
        this.context = context;
        this.ids = ids;
        this.names = names;
        this.emails = emails;
        this.subjects = subjects;
        this.bodys = bodys;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.display2, null, true);
       // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView Subjects = (TextView) listViewItem.findViewById(R.id.subject2);
        TextView Bodys = (TextView) listViewItem.findViewById(R.id.body2);

        //textViewId.setText(ids[position]);
        textViewName.setText(names[position]);
       // textViewEmail.setText(emails[position]);
        Subjects.setText(subjects[position]);
        Bodys.setText(bodys[position]);

        return listViewItem;
    }
}
