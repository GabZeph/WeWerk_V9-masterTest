package com.example.wewerk_v8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class CreateFragment extends Fragment {
    private Button addExercise_button;

    public static CreateFragment newInstance() {
        CreateFragment fragment = new CreateFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_create,
                container, false);

        addExercise_button = view.findViewById(R.id.addExercise);
        addExercise_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
   //             FragmentTransaction ft = getFragmentManager().beginTransaction();
   // openExerciseCreator();
    openExerciseList();
            }
    });
        return view;
    }

  /*  @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button addExercise_button = view.findViewById(R.id.addExercise);
        addExercise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseCreator();            }
        });
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       /* addExercise_button = findViewById(R.id.addExercise);
        addExercise_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseCreator();
            }
        });*/
    }

    public void openExerciseCreator() {
        Intent intent = new Intent(getActivity(), CreateExerciseFragment.class);
        startActivity(intent);
    }


    public void openExerciseList() {
        Intent intent = new Intent(getActivity(), Exercises.class);
        startActivity(intent);
    }
}