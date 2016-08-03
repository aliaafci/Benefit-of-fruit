package com.aliaa.android;

import com.aliaaapp.android.ListFruitsActivity;
import com.mkyong.android.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class Benefit_Fruit_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_benefit__fruit_);
		setTitle(ListFruitsActivity.FruitName_);

		ImageView v =(ImageView)findViewById(R.id.ivID);
		 

		if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Apple"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.apple));
		}
		else if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Avocado"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.av));
		}
		else if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Banana"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.banana));
		}
		else if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Blackberry"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.black));
		}
		else if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Mango"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.man));
		}
		else if(ListFruitsActivity.FruitName_.equalsIgnoreCase("Orange"))
		{
			v.setImageDrawable(getResources().getDrawable(R.drawable.oran));
		}

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.benefit__fruit_, menu);
		return true;
	}

}
