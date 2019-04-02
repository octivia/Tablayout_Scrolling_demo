package com.technohack.tablayout_scrolling;


//import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //set the fragment to the viewPager
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                TVFragment tvFragment=new TVFragment();
                return tvFragment;
            case 1:
                MovieFragment movieFragment=new MovieFragment();
                return movieFragment;
            case 2:
                NotificationFragment notificationFragment=new NotificationFragment();
                return notificationFragment;
            /*case 3:
                  FriendsFragment friendsFragment=new FriendsFragment();
                  return friendsFragment;
            case 4:
                  AccountFragment accountFragment=new AccountFragment();
                  return accountFragment;
                  */
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //@Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "TVShows";
            case 1:
                return "Movies";
            case 2:
                return "Notifications";
            /*case 3:
                return "Credit Movies";
            case 4:
                return "Account";
                */
            default:
                return null;

        }

    }
}
