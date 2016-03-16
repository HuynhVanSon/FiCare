package grp.s2tyn.ficare.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import grp.s2tyn.ficare.R;

/**
 * Created by Sonhv on 3/14/2016.
 */
public class FragmentSetting extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_setting, container, false);
    }
}
