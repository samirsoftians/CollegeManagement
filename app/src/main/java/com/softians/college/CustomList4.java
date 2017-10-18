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

public class CustomList4 extends ArrayAdapter<String> {
    private String[] ids4;
    private String[] names4;
    private String[] emails4;
    private String[] subjects4;
    private String[] bodys4;
    private Activity context;

    public CustomList4(Activity context, String[] ids4, String[] names4, String[] emails4, String[] subjects4, String[] bodys4) {
        super(context, R.layout.display4, ids4);
        this.context = context;
        this.ids4 = ids4;
        this.names4 = names4;
        this.emails4 = emails4;
        this.subjects4 = subjects4;
        this.bodys4 = bodys4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.display4, null, true);
       // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView textViewName4 = (TextView) listViewItem.findViewById(R.id.Name4);
        TextView Subjects4 = (TextView) listViewItem.findViewById(R.id.subject4);
        TextView Bodys4 = (TextView) listViewItem.findViewById(R.id.body4);

        //textViewId.setText(ids[position]);
        textViewName4.setText(names4[position]);
       // textViewEmail.setText(emails[position]);
        Subjects4.setText(subjects4[position]);
        Bodys4.setText(bodys4[position]);

        return listViewItem;
    }
}
