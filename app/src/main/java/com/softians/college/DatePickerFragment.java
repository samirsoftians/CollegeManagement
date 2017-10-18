package com.softians.college;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements OnDateSetListener 
{
	int year;
	int month;
	int day;
	String DATES;
	Context context;

	//public static final String JSON_URL12 = "http://ranjana.000webhostapp.com/d.php";
	//RequestQueue requestQueue99;
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub

		//requestQueue99 = Volley.newRequestQueue(context);
		final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
	}

	public void onDateSet(DatePicker view, int year, int monthOfYear,int dayOfMonth) 
	{
		// TODO Auto-generated method stub
		   this.year = year;
	       this.month = monthOfYear;
	       this.day = dayOfMonth;
		
	       TextView tv = (TextView) getActivity().findViewById(R.id.ttt);


	 
	       tv.setText(""+year+"-"+monthOfYear+"-"+dayOfMonth);
		DATES=""+year+"-"+monthOfYear+"-"+dayOfMonth;

		//**********************************************


	}
	

}
