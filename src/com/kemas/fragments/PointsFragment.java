package com.kemas.fragments;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kemas.R;

/*  Fragment para seccion perfil */
@SuppressLint("NewApi")
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PointsFragment extends Fragment {
	private TextView txtInit;

	public PointsFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_points, container, false);
		txtInit = (TextView) rootView.findViewById(R.id.txtInit);
		txtInit.setText("Pio Pio");
		return rootView;
	}
}