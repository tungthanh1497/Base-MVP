package com.tungtt.basemvp.mvp.presenter;

import com.tungtt.basemvp.mvp.model.IBaseModelLayer;
import com.tungtt.basemvp.mvp.view.IBaseViewLayer;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:36
 */
public interface IBasePresenterLayer<V extends IBaseViewLayer, M extends IBaseModelLayer> {

    void back();

    V mView();

    void initViewLayer(V view);

    M mModel();

    void initModelLayer(M model);
}
