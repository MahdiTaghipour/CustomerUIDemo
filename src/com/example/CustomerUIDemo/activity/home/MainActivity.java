package com.example.CustomerUIDemo.activity.home;


import com.example.CustomerUIDemo.R;
import com.example.CustomerUIDemo.activity.CustomerActionBar.CustomerActionBarActivity;
import com.example.CustomerUIDemo.activity.DrawerDemo.DrawerDemoActivity;
import com.example.CustomerUIDemo.activity.ExpandableListviewDemo.ExpandableListviewDemoActivity;
import com.example.CustomerUIDemo.activity.TabHost.TabHostDemoActivity;
import com.example.CustomerUIDemo.activity.TextviewEditTextDemo.TextViewAndEditViewDemoActivity;
import com.example.CustomerUIDemo.activity.ViewHolderDemo.ViewHolderDemoActvity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button textviewAndEditTextDemoButton;
	private Button tabhostDemoButton;
	private Button drawerDemoButton;
	private Button viewHolderDemoButton;
	private Button expandableListviewDemoButton;
	private Button customerActionBarDemoButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		textviewAndEditTextDemoButton = (Button) findViewById(R.id.main_textviewAndEditTextDemoButton);
		textviewAndEditTextDemoButton.setOnClickListener(this);
		
		tabhostDemoButton = (Button) findViewById(R.id.main_tabhostDemoButton);
		tabhostDemoButton.setOnClickListener(this);
		
		drawerDemoButton = (Button) findViewById(R.id.main_drawerDemoButton);
		drawerDemoButton.setOnClickListener(this);
		
		viewHolderDemoButton = (Button) findViewById(R.id.main_viewHolderDemoButton);
		viewHolderDemoButton.setOnClickListener(this);
		
		expandableListviewDemoButton = (Button) findViewById(R.id.main_expandableListviewDemoButton);
		expandableListviewDemoButton.setOnClickListener(this);
		
		customerActionBarDemoButton = (Button) findViewById(R.id.main_customerActionBarDemoButton);
		customerActionBarDemoButton.setOnClickListener(this);
		
		
		
	}

	
	@Override
	public void onClick(View view) {
		 Intent intent = new Intent();

		switch (view.getId()) {
		case R.id.main_textviewAndEditTextDemoButton:
			intent.setClass(this, TextViewAndEditViewDemoActivity.class);
			startActivity(intent);

			break;

		case R.id.main_tabhostDemoButton:
			intent.setClass(this, TabHostDemoActivity.class);
			startActivity(intent);
			
			break;
						
		case R.id.main_drawerDemoButton:
			intent.setClass(this, DrawerDemoActivity.class);
			startActivity(intent);
			
			break;
						
		case R.id.main_expandableListviewDemoButton:
			intent.setClass(this, ExpandableListviewDemoActivity.class);
			startActivity(intent);
			
			break;
						
		case R.id.main_viewHolderDemoButton:
			intent.setClass(this, ViewHolderDemoActvity.class);
			startActivity(intent);
			
			break;
						
		case R.id.main_customerActionBarDemoButton:
			intent.setClass(this, CustomerActionBarActivity.class);
			startActivity(intent);
			
			break;
						
		default:
			break;
		}
	}

}
