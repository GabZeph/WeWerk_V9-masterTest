package com.example.wewerk_v8;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        Fragment selectedFragment = null;
                        switch (menuItem.getItemId()) {
                            case R.id.action_discover:
                                selectedFragment = DiscoverFragment.newInstance();
                                break;
                            case R.id.action_create:
                                selectedFragment = CreateFragment.newInstance();
                                //FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                                //transaction.add(R.id.main_frame_container, new CreateExerciseFragment());
                                //transaction.commit();
                                break;
                            case R.id.action_programs:
                                selectedFragment = ProgramsFragment.newInstance();
                                break;
                            case R.id.action_profile:
                                selectedFragment = ProfileFragment.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.main_frame_container, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                }
        );

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame_container, DiscoverFragment.newInstance());
        transaction.commit();

    }

}
