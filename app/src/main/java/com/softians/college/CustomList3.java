package com.softians.college;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

/**
 * Created by Lenovo on 2/28/2017.
 */

public class CustomList3 extends ArrayAdapter<String> {

    private String[] times;
    private String[] mondays;
    private String[] tuesdays;
    private String[] wednesdays;
    private String[] thursdays;
    private String[] fridays;
    private String[] saturdays;
    private Activity context;

   // private String[] ids=new String[1];

    String[] count;




    //*******************************************


    public CustomList3(Activity context,String[] times, String[] mondays, String[] tuesdays, String[] wednesdays, String[] thursdays, String[] fridays, String[] saturdays,String[] count) {

        super(context, R.layout.activity_timetable, count);
        this.context = context;
        //this.ids = ids;
        this.count = count;
        this.times = times;
        this.mondays = mondays;
        this.tuesdays = tuesdays;
        this.wednesdays = wednesdays;
        this.thursdays = thursdays;
        this.fridays = fridays;
        this.saturdays = saturdays;

        //*******************************************************


        //**********************************************************
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_timetable, null, true);
//        TextView textViewId = (TextView) listViewItem.findViewById(R.id.textViewId);
//        TextView time = (TextView) listViewItem.findViewById(R.id.time1);
//        TextView mon = (TextView) listViewItem.findViewById(R.id.mon);
//        TextView tues = (TextView) listViewItem.findViewById(R.id.tues);
//        TextView wed = (TextView) listViewItem.findViewById(R.id.wed);
//        TextView thus = (TextView) listViewItem.findViewById(R.id.thu);
//        TextView fri = (TextView) listViewItem.findViewById(R.id.fri);
//        TextView sat = (TextView) listViewItem.findViewById(R.id.sat);

        EditText f1,f2,f3,f4,f5,f6,f7;
        EditText g1,g2,g3,g4,g5,g6,g7;
        EditText h1,h2,h3,h4,h5,h6,h7;
        EditText i1,i2,i3,i4,i5,i6,i7;
        EditText j1,j2,j3,j4,j5,j6,j7;
        EditText k1,k2,k3,k4,k5,k6,k7;
        EditText l1,l2,l3,l4,l5,l6,l7;

        f1= (EditText) listViewItem.findViewById(R.id.F1);
        f2= (EditText) listViewItem.findViewById(R.id.F2);
        f3= (EditText) listViewItem.findViewById(R.id.F3);
        f4= (EditText) listViewItem.findViewById(R.id.F4);
        f5= (EditText) listViewItem.findViewById(R.id.F5);
        f6= (EditText) listViewItem.findViewById(R.id.F6);
        f7= (EditText) listViewItem.findViewById(R.id.F7);


        g1= (EditText) listViewItem.findViewById(R.id.G1);
        g2= (EditText) listViewItem.findViewById(R.id.G2);
        g3= (EditText) listViewItem.findViewById(R.id.G3);
        g4= (EditText) listViewItem.findViewById(R.id.G4);
        g5= (EditText) listViewItem.findViewById(R.id.G5);
        g6= (EditText) listViewItem.findViewById(R.id.G6);
        g7= (EditText) listViewItem.findViewById(R.id.G7);


        h1= (EditText) listViewItem.findViewById(R.id.H1);
        h2= (EditText) listViewItem.findViewById(R.id.H2);
        h3= (EditText) listViewItem.findViewById(R.id.H3);
        h4= (EditText) listViewItem.findViewById(R.id.H4);
        h5= (EditText) listViewItem.findViewById(R.id.H5);
        h6= (EditText) listViewItem.findViewById(R.id.H6);
        h7= (EditText) listViewItem.findViewById(R.id.H7);

        i1= (EditText) listViewItem.findViewById(R.id.I1);
        i2= (EditText) listViewItem.findViewById(R.id.I2);
        i3= (EditText) listViewItem.findViewById(R.id.I3);
        i4= (EditText) listViewItem.findViewById(R.id.I4);
        i5= (EditText) listViewItem.findViewById(R.id.I5);
        i6= (EditText) listViewItem.findViewById(R.id.I6);
        i7= (EditText) listViewItem.findViewById(R.id.I7);

        j1= (EditText) listViewItem.findViewById(R.id.J1);
        j2= (EditText) listViewItem.findViewById(R.id.J2);
        j3= (EditText) listViewItem.findViewById(R.id.J3);
        j4= (EditText) listViewItem.findViewById(R.id.J4);
        j5= (EditText) listViewItem.findViewById(R.id.J5);
        j6= (EditText) listViewItem.findViewById(R.id.J6);
        j7= (EditText) listViewItem.findViewById(R.id.J7);

        k1= (EditText) listViewItem.findViewById(R.id.K1);
        k2= (EditText) listViewItem.findViewById(R.id.K2);
        k3= (EditText) listViewItem.findViewById(R.id.K3);
        k4= (EditText) listViewItem.findViewById(R.id.K4);
        k5= (EditText) listViewItem.findViewById(R.id.K5);
        k6= (EditText) listViewItem.findViewById(R.id.K6);
        k7= (EditText) listViewItem.findViewById(R.id.K7);


        l1= (EditText) listViewItem.findViewById(R.id.L1);
        l2= (EditText) listViewItem.findViewById(R.id.L2);
        l3= (EditText) listViewItem.findViewById(R.id.L3);
        l4= (EditText) listViewItem.findViewById(R.id.L4);
        l5= (EditText) listViewItem.findViewById(R.id.L5);
        l6= (EditText) listViewItem.findViewById(R.id.L6);
        l7= (EditText) listViewItem.findViewById(R.id.L7);



        f7.setText(times[0]);
        f1.setText(mondays[0]);
        f2.setText(tuesdays[0]);
        f3.setText(wednesdays[0]);
        f4.setText(thursdays[0]);
        f5.setText(fridays[0]);
        f6.setText(saturdays[0]);




        g7.setText(times[1]);
        g1.setText(mondays[1]);
        g2.setText(tuesdays[1]);
        g3.setText(wednesdays[1]);
        g4.setText(thursdays[1]);
        g5.setText(fridays[1]);
        g6.setText(saturdays[1]);


        h7.setText(times[2]);
        h1.setText(mondays[2]);
        h2.setText(tuesdays[2]);
        h3.setText(wednesdays[2]);
        h4.setText(thursdays[2]);
        h5.setText(fridays[2]);
        h6.setText(saturdays[2]);


        i7.setText(times[3]);
        i1.setText(mondays[3]);
        i2.setText(tuesdays[3]);
        i3.setText(wednesdays[3]);
        i4.setText(thursdays[3]);
        i5.setText(fridays[3]);
        i6.setText(saturdays[3]);



        j7.setText(times[4]);
        j1.setText(mondays[4]);
        j2.setText(tuesdays[4]);
        j3.setText(wednesdays[4]);
        j4.setText(thursdays[4]);
        j5.setText(fridays[4]);
        j6.setText(saturdays[4]);


        k7.setText(times[5]);
        k1.setText(mondays[5]);
        k2.setText(tuesdays[5]);
        k3.setText(wednesdays[5]);
        k4.setText(thursdays[5]);
        k5.setText(fridays[5]);
        k6.setText(saturdays[5]);


        l7.setText(times[6]);
        l1.setText(mondays[6]);
        l2.setText(tuesdays[6]);
        l3.setText(wednesdays[6]);
        l4.setText(thursdays[6]);
        l5.setText(fridays[6]);
        l6.setText(saturdays[6]);



        return listViewItem;
    }
}
