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

public class HideFragmentActivity extends FragmentActivity {
	
	
	private final String TAG = this.getClass().getSimpleName();
	private TextView mTextView;
	private Button mButtonA;
	private Button mButtonB;
	
	private Fragment fragmentA;
	private Fragment fragmentB;
	
	
	private void initFragments(Bundle savedInstanceState){
		if (savedInstanceState == null) {
			fragmentA = new FragmentA();
			fragmentB = new FragmentB();			
		}
	}
	
	private void displayFragment(Fragment fragment) {
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		if (fragment.isAdded()){
			//Log.d(TAG, "Show " + fragment.getClass().getSimpleName());
			ft.show(fragment);
		} else {
			//Log.d(TAG, "Add " + fragment.getClass().getSimpleName());
			ft.add(R.id.frag_container, fragment,fragment.getClass().getSimpleName());
			//Log.d(TAG, "Show " + fragment.getClass().getSimpleName());
			ft.show(fragment);
		}
		
		if (fragment instanceof FragmentA) {
			//Log.d(TAG, "Hide B");
			ft.hide(fragmentB);			
		} else {
			//Log.d(TAG, "Hide A");
			ft.hide(fragmentA);
		}
		ft.addToBackStack(null);
		ft.commit();

		
	}
	
	private void clearBackStack() {
		FragmentManager fm = getSupportFragmentManager();
		if (fm.getBackStackEntryCount()>6) {
			Log.i(TAG,"Clear BackStack");
			fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		Log.i(TAG,"onCreate");

		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_main);
		mTextView = (TextView) findViewById(R.id.textView);
		mTextView.setText("Example: hiding and showing fragments");
		initFragments(savedInstanceState);
		mButtonA = (Button) findViewById(R.id.buttonA);
		mButtonA.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				clearBackStack();
				displayFragment(fragmentA);
				Log.i(TAG,"Show A, hide B");
			}
			
		});
		mButtonB = (Button) findViewById(R.id.buttonB);		
		mButtonB.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				clearBackStack();
				displayFragment(fragmentB);
				Log.i(TAG,"Show B, hide A");
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
