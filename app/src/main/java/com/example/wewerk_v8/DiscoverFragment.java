package com.example.wewerk_v8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import static com.example.wewerk_v8.R.layout.fragment_discover;

public class DiscoverFragment extends Fragment {

    GridLayout discoverGridLayout;

    public static DiscoverFragment newInstance() {
        DiscoverFragment fragment = new DiscoverFragment();
        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // discoverGridLayout=(GridLayout) getView().findViewById(R.id.discover_gridlayout);
//https://stackoverflow.com/questions/26545997/creating-switch-case-onclicklistener-for-textview

        // lorsquon clique sur un des layouts, on se fait referer a la page contenant tous les programmes
        //selon le layouts cliques
      /* discoverGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (getContext(),ProgramDiscoveryActivity.class);
               startActivity(intent);
            }
        });*/

      


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(fragment_discover, container, false);
    }




}
