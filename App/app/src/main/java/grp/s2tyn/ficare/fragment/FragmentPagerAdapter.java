package grp.s2tyn.ficare.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Sonhv on 3/14/2016.
 */
public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public FragmentPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentNews tabNews= new FragmentNews();
                return tabNews;
            case 1:
                FragmentShare tabShare = new FragmentShare();
                return tabShare;
            case 2:
                FragmentMessage tabMessage = new FragmentMessage();
                return tabMessage;
            case 3:
                FragmentSetting tabSetting = new FragmentSetting();
                return tabSetting;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
