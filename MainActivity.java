package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(new MyAdapter());
	}

	public class MyAdapter extends BaseAdapter {

		
		public int getCount() {
			return 8;
		}

		
		public Object getItem(int position) {
			return null;
		}

		
		public long getItemId(int position) {
			return 0;
		}

		
		public View getView(int position, View convertView, ViewGroup parent) {
			View view;
			if(convertView==null){
				view = View.inflate(getApplicationContext(), R.layout.item, null);
			}else{
				view = convertView;
			}
			return view;
		}

	}
}
