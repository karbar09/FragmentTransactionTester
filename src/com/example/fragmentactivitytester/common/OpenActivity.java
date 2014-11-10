package com.example.fragmentactivitytester.common;

import com.example.fragmentactivitytester.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OpenActivity extends Activity {
	
	
	private final String TAG = this.getClass().getSimpleName();
	private Button mButtonA;
	private Button mButtonB;
	private Context mContext;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		Log.i(TAG,"onCreate");

		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_open);
		mContext = this;
		mButtonA = (Button) findViewById(R.id.buttonStartFragmentActivityReplace);
		mButtonA.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Log.i(TAG,"Replace Clicked");
				startActivity(new Intent(mContext, ReplaceFragmentActivity.class));
			}
			
		});
		mButtonB = (Button) findViewById(R.id.buttonStartFragmentActivityHide);		
		mButtonB.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Log.i(TAG,"Show/Hide Clicked");
				startActivity(new Intent(mContext, HideFragmentActivity.class));

			}
			
		});

	}
	
	@Override
	public void onContentChanged(){
		Log.i(TAG,"onContentChanged");

		super.onContentChanged();
	}

	@Override
	public void onStart(){
		Log.i(TAG,"onStart");

		super.onStart();
	}
	
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.i(TAG,"onRestoreInstanceState");

		super.onRestoreInstanceState(savedInstanceState);
	}
	
	@Override
	public void onPostCreate(Bundle savedInstanceState){
		Log.i(TAG,"onPostCreate");

		super.onPostCreate(savedInstanceState);
	}
	
	@Override
	public void onResume(){
		Log.i(TAG,"onResume");

		super.onResume();
	}
	
	@Override
	public void onPostResume(){
		Log.i(TAG,"onPostResume");

		super.onPostResume();
	}
	
	@Override
	public void onAttachedToWindow(){
		Log.i(TAG,"onAttachedToWindow");

		super.onAttachedToWindow();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		Log.i(TAG,"onCreateOptionsMenu");

		super.onCreateOptionsMenu(menu);
		return false;
	}
	
	@Override
	public boolean onPrepareOptionsMenu(Menu menu){
		Log.i(TAG,"onPrepareOptionsMenu");

		super.onPrepareOptionsMenu(menu);
		return false;
	}
	
	@Override
	public void onUserInteraction(){
		Log.i(TAG,"onUserInteraction");
		super.onUserInteraction();	
	}
	
	@Override
	public void onUserLeaveHint(){
		Log.i(TAG,"onUserLeaveHint");
		super.onUserLeaveHint();	
	}
	
	
	@Override
	public void onPause() {
		Log.i(TAG,"onPause");

		super.onPause();
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		Log.i(TAG,"onSaveInstanceState");

		super.onSaveInstanceState(outState);
	}
	
	@Override
	public void onStop(){
		Log.i(TAG,"onStop");
		super.onStop();
	}

	@Override
	public void onDestroy(){
		Log.i(TAG,"onDestroy");
		super.onDestroy();

	}
	
}
