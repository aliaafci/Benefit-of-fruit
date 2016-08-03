package com.aliaaapp.android.adaptor;

import com.mkyong.android.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;

	public FruitArrayAdapter(Context context, String[] values) {
		super(context, R.layout.list_mobile, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_mobile, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);
		 

		if (s.equals("Apple")) {
			imageView.setImageResource(R.drawable.app);
		} else if (s.equals("Avocado")) {
			imageView.setImageResource(R.drawable.header_avocado);
		} else if (s.equals("Banana")) {
			imageView.setImageResource(R.drawable.bananasf);
		}
		else if (s.equals("Blackberry")) {
			imageView.setImageResource(R.drawable.blackberry);
		}
		else if (s.equals("Mango")) {
			imageView.setImageResource(R.drawable.mango);
		}
		else if (s.equals("Orange")) {
			imageView.setImageResource(R.drawable.images);
		}

		return rowView;
	}
}
