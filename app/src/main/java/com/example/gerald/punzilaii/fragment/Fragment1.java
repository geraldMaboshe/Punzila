package com.example.gerald.punzilaii.fragment;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gerald.punzilaii.R;

/**
 * Created by Gerald on 11/11/2017.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Fragment1 extends Fragment {
    public Fragment1(){

    }

    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
            View rootView = inflater.inflate(R.layout.fragment1,container,false);
            return rootView;
        }
}
