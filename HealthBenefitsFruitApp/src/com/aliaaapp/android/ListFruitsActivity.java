package com.aliaaapp.android;

import com.aliaa.android.Benefit_Fruit_Activity;
import com.aliaaapp.android.adaptor.FruitArrayAdapter;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

public class ListFruitsActivity extends ListActivity {
    public static  String FruitName_  =" ";
	static final String[] FruitName = new String[] { "Apple", "Avocado" , "Banana","Blackberry"
			 ,"Mango","Orange"};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(" List Of Fruit  ");

		//setListAdapter(new ArrayAdapter<String>(this, R.layout.list_mobile,
		//		R.id.label, MOBILE_OS));
		
		setListAdapter(new FruitArrayAdapter(this, FruitName));
		

	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {

		//get selected items
		String selectedValue = (String) getListAdapter().getItem(position);
		FruitName_= selectedValue;
		//Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
		
		
		
		 Intent Benefit_Fruit = new Intent(this, Benefit_Fruit_Activity.class);
	        startActivity(Benefit_Fruit);
	}

}