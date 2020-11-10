package com.tungtt.basemvpimpl.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

import com.tungtt.basemvp.BaseFragment;

public class MainFragment extends BaseFragment<IMainContract.View, IMainContract.Model>
        implements IMainContract.Presenter {

    public static MainFragment newInstance() {
        return new MainFragment();
    }


    @Override
    public void initViewModel() {
        initModelLayer(MainModel.newInstance());
        initViewLayer(MainView.newInstance());
    }

    @Override
    public void onReceiveData(@NonNull Bundle data) {

    }

    @Override
    public void init(View view) {
        onTvClicked();
    }

    @Override
    public void onTvClicked() {
        if (mModel().isEven()) {
            mView().updateText("Even");
        } else {
            mView().updateText("Odd");
        }
    }
}