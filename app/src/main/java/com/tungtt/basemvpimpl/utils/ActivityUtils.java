package com.tungtt.basemvpimpl.utils;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.tungtt.basemvpimpl.MainActivity;
import com.tungtt.basemvpimpl.R;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Mon, 19 Oct 2020 - 15:41
 */
public class ActivityUtils {

    public static void addScreen(Fragment fragment, String tag) {
        addScreen(fragment, tag, null);
    }

    /**
     * open a new Fragment and add to backstack
     *
     * @param fragment: destination fragment
     * @param tag:      fragment's TAG
     * @param data:     bundle to transfer data (if needed)
     */
    public static void addScreen(Fragment fragment,
                                 String tag,
                                 Bundle data) {
        if (data != null) {
            fragment.setArguments(data);
        }
        MainActivity.getInstance().getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, fragment)
                .addToBackStack(tag)
                .commit();
    }
}
