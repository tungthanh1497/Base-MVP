package com.tungtt.basemvp.mvp.view;

import android.view.View;

import androidx.annotation.LayoutRes;

import com.tungtt.basemvp.mvp.presenter.IBasePresenterLayer;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:38
 */
public interface IBaseViewLayer<P extends IBasePresenterLayer> {

    P mPresenter();

    void initPresenterLayer(P presenter);

    @LayoutRes
    int getLayoutRes();

    void bindViews(View view);

    void init();
}
