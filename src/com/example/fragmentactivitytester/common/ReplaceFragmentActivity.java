package com.example.fragmentactivitytester.common;

import com.example.fragmentactivitytester.R;
import com.example.fragmentactivitytester.fragments.FragmentA;
import com.example.fragmentactivitytester.fragments.FragmentB;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ReplaceFragmentActivity extends FragmentActivity {
	
	
	private final String TAG = this.getClass().getSimpleName();
	private Button mButtonA;
	private Button mButtonB;
	private TextView mTextView;

	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		Log.i(TAG,"onCreate");

		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		mTextView = (TextView) findViewById(R.id.textView);
		mTextView.setText("Example: Replace fragments");
		mButtonA = (Button) findViewById(R.id.buttonA);
		mButtonA.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
				fragmentTransaction.replace(R.id.frag_container,new FragmentA());
				fragmentTransaction.addToBackStack(null);
				fragmentTransaction.commit();
				Log.i(TAG,"FragmentTransaction Replace B with A");
			}
			
		});
		mButtonB = (Button) findViewById(R.id.buttonB);		
		mButtonB.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
				fragmentTransaction.replace(R.id.frag_container,new FragmentB());
				fragmentTransaction.addToBackStack(null);
				fragmentTransaction.commit();
				Log.i(TAG,"FragmentTransaction Replace A with B");
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
