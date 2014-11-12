package com.example.CustomerUIDemo.activity.AnimationDemo;

import com.example.CustomerUIDemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class AnmationDemoActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anmation_demo_activity);
		View view = (View)findViewById(R.id.anmationDemo_textView);
		view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anmation_demo_anmation));
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}

	
}
