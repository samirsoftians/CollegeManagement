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

public class CustomList6 extends ArrayAdapter<String> {
    private String[] ids6;
    private String[] names6;
    private String[] emails6;
    private String[] subjects6;
    private String[] bodys6;
    private Activity context;

    public CustomList6(Activity context, String[] ids6, String[] names6, String[] emails6, String[] subjects6, String[] bodys6) {
        super(context, R.layout.list_view_stud_notice, ids6);
        this.context = context;
        this.ids6 = ids6;
        this.names6 = names6;
        this.emails6 = emails6;
        this.subjects6 = subjects6;
        this.bodys6 = bodys6;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_stud_notice, null, true);
       // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView NoticceName = (TextView) listViewItem.findViewById(R.id.noticstudename);
        TextView NoticeSubjects = (TextView) listViewItem.findViewById(R.id.noticestudsubject);
        TextView NoticeBodys = (TextView) listViewItem.findViewById(R.id.noticestudbody);

        //textViewId.setText(ids[position]);
        NoticceName.setText(names6[position]);
       // textViewEmail.setText(emails[position]);
        NoticeSubjects.setText(subjects6[position]);
        NoticeBodys.setText(bodys6[position]);

        return listViewItem;
    }
}
