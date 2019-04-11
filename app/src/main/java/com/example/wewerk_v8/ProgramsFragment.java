package com.example.wewerk_v8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.wewerk_v8.R.layout.fragment_programs;


public class ProgramsFragment extends Fragment {

    public static ProgramsFragment newInstance() {
        ProgramsFragment fragment = new ProgramsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
// setContentView(R.layout.fragment_programs);
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(fragment_programs, container, false);
    }

}




