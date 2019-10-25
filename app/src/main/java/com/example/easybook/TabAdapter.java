package com.example.easybook;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int tabposition) {
        switch (tabposition) {
            case 0:
                profileTab ProfileTab = new profileTab();
                return ProfileTab;
            case 1:
                userTab UserTab=new userTab();
                return UserTab;
            case 2:
                sharepicture Sharepicture=new sharepicture();
                return  Sharepicture;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "profile";
            case 1:
                return "users";
            case 2:
                return "sharepicture";
                default:
                    return  null;
        }
    }
}
