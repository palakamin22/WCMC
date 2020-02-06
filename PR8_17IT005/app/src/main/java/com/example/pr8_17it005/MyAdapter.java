package com.example.pr8_17it005;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Prac1 prac1 = new Prac1();
                return prac1;
            case 1:
                prac2 prac2 = new prac2();
                return prac2;
            case 2:
                Prac3 prac3 = new Prac3();
                return prac3;
            case 3:
                Prac4 prac4 = new Prac4();
                return prac4;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
