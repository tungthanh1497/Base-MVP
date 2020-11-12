package com.tungtt.basemvp;

import android.view.KeyEvent;
import android.view.View;

import com.tungtt.basemvp.mvp.model.IBaseModelLayer;
import com.tungtt.basemvp.mvp.presenter.BasePresenterLayer;
import com.tungtt.basemvp.mvp.view.IBaseViewLayer;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 18:28
 */
public abstract class BaseFragment<V extends IBaseViewLayer, M extends IBaseModelLayer>
        extends BasePresenterLayer<V, M> {

    @Override
    public void initView(View view) {
        handlePhysicalBackClicked(view);
        mView().bindViews(view);
        mView().init();
    }

    @Override
    public void initModel() {
        mModel().init();
    }

    /**
     * Handle event click on physical back button
     *
     * @param view: current screen
     */
    private void handlePhysicalBackClicked(View view) {
        if (view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnKeyListener(new View.OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                        back();
                        return true;
                    }
                    return false;
                }
            });
        }
    }
}
