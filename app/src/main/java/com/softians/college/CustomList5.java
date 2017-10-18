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

public class CustomList5 extends ArrayAdapter<String> {
    private String[] ids5;
    private String[] names5;
    private String[] emails5;
    private String[] subjects5;
    private String[] bodys5;
    private Activity context;

    public CustomList5(Activity context, String[] ids5, String[] names5, String[] emails5, String[] subjects5, String[] bodys5) {
        super(context, R.layout.list_view_notice, ids5);
        this.context = context;
        this.ids5 = ids5;
        this.names5 = names5;
        this.emails5 = emails5;
        this.subjects5 = subjects5;
        this.bodys5 = bodys5;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_view_notice, null, true);
       // TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
        TextView NoticceName = (TextView) listViewItem.findViewById(R.id.noticename);
        TextView NoticeSubjects = (TextView) listViewItem.findViewById(R.id.noticesubject);
        TextView NoticeBodys = (TextView) listViewItem.findViewById(R.id.noticebody);

        //textViewId.setText(ids[position]);
        NoticceName.setText(names5[position]);
       // textViewEmail.setText(emails[position]);
        NoticeSubjects.setText(subjects5[position]);
        NoticeBodys.setText(bodys5[position]);

        return listViewItem;
    }
}
