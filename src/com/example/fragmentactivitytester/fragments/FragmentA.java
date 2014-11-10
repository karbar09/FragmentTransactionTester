package com.example.fragmentactivitytester.fragments;

import com.example.fragmentactivitytester.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
	
	private final String TAG = this.getClass().getSimpleName();
	private TextView mTextView;
	
	View fragmentView;
	@Override
	public void onAttach(Activity activity) {
		Log.i(TAG,"onAttach");
		super.onAttach(activity);

	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "onCreate");
		super.onCreate(savedInstanceState);

	}
	
	@Override 
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
		Log.i(TAG,"onCreateView");

		super.onCreateView(inflater, container, savedInstanceState);
		View v = inflater.inflate(R.layout.layout_fragment_a, container,false);		
		mTextView = (TextView) v.findViewById(R.id.textView1);
		mTextView.setText(TAG);
		return v;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState){
		Log.i(TAG,"onViewCreated");
		super.onViewCreated(view, savedInstanceState);
		
		
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		Log.i(TAG,"onActivityCreated");
		super.onActivityCreated(savedInstanceState);

	}
	
	@Override
	public void onStart(){
		Log.i(TAG,"onStart");
		super.onStart();

	}
	
	@Override
	public void onResume(){
		Log.i(TAG,"onResume");
		super.onResume();

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
	public void onDestroyView(){
		Log.i(TAG,"onDestroyView");
		super.onDestroyView();

	}

	@Override
	public void onDestroy(){
		Log.i(TAG,"onDestroy");
		super.onDestroy();

	}
	
	@Override
	public void onDetach(){
		Log.i(TAG,"onDetach");
		super.onDetach();

	}
	
	public String getTAG() {
		return TAG;
	}
}
