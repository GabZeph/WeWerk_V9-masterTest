package com.example.wewerk_v8;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProgramTabFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_program_tab);

     /*  TabLayout tabLayout= (TabLayout) findViewById(R.id.tabProgram_tabLayout);
        TabItem myWorkouts_tabItem= (TabItem) findViewById(R.id.myWorkouts_tabItem);
        TabItem favoriteProgram_tabItem= (TabItem) findViewById(R.id.favoritesPrograms_tabItem);
        ViewPager viewPager=(ViewPager) findViewById(R.id.tabProgram_viewPager);
        ProgramTabPagerAdapter programTabPagerAdapter=new ProgramTabPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(programTabPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
*/

       /* tabLayout.addTab(tabLayout.newTab().setText(R.string.text_myworkouts));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.text_favoriteprograms));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.tabProgram_viewPager);
        final ProgramTabPagerAdapter adapter = new ProgramTabPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });*/
    }
    }

