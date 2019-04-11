package com.example.wewerk_v8;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ProgramTabPagerAdapter extends FragmentStatePagerAdapter {
    int numbTab;

    public ProgramTabPagerAdapter(FragmentManager fragmentManager, int numbTab){
        super(fragmentManager);
        this.numbTab=numbTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return  new MyWorkoutsFragment();
            case 1:
                return new FavoriteProgramsFragment();
            default:
                return null;
        }
}

    @Override
    public int getCount() {
        return numbTab;
    }


}
