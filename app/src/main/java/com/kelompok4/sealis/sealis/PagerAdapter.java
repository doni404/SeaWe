package com.kelompok4.sealis.sealis; /**
 * Created by Ranu on 19/11/2015.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kelompok4.sealis.sealis.SubsFragment;
import com.kelompok4.sealis.sealis.WarningFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                WarningFragment tab1 = new WarningFragment();
                return tab1;
            case 1:
                SubsFragment tab2 = new SubsFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}