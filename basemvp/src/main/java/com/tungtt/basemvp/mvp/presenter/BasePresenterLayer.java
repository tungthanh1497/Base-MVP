package com.tungtt.basemvp.mvp.presenter;

import com.tungtt.basemvp.mvp.model.IBaseModelLayer;
import com.tungtt.basemvp.mvp.view.IBaseViewLayer;
import com.tungtt.basemvp.ui.SimpleFragment;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:32
 */
public abstract class BasePresenterLayer<V extends IBaseViewLayer, M extends IBaseModelLayer>
        extends SimpleFragment
        implements IBasePresenterLayer<V, M> {

    private V mView;
    private M mModel;

    @Override
    public int getLayoutRes() {
        return mView.getLayoutRes();
    }

    @Override
    public void back() {

    }

    public M mModel() {
        return mModel;
    }

    public void initModelLayer(M model) {
        this.mModel = model;
        this.mModel.initPresenterLayer(this);
    }

    public V mView() {
        return mView;
    }

    public void initViewLayer(V view) {
        this.mView = view;
        this.mView.initPresenterLayer(this);
    }
}
