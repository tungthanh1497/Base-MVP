package com.tungtt.basemvp.mvp.model;

import com.tungtt.basemvp.mvp.presenter.IBasePresenterLayer;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:38
 */
public interface IBaseModelLayer<P extends IBasePresenterLayer> {

    P mPresenter();

    void initPresenterLayer(P presenter);

    void init();
}
