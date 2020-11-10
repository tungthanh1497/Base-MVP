package com.tungtt.basemvp;

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
        mView().bindViews(view);
        mView().init();
    }

    @Override
    public void initModel() {
        mModel().init();
    }
}
