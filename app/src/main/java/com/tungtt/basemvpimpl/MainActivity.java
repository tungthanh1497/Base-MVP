package com.tungtt.basemvpimpl;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tungtt.basemvpimpl.ui.MainFragment;
import com.tungtt.basemvpimpl.utils.ActivityUtils;
import com.tungtt.basemvpimpl.utils.Constants;

public class MainActivity extends AppCompatActivity {

    private static MainActivity instance;

    public static MainActivity getInstance() {
        if (instance == null) {
            instance = new MainActivity();
        }
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;
        ActivityUtils.addScreen(MainFragment.newInstance(), Constants.SCREEN_TAG.MAIN);
    }
}

