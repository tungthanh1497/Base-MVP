package com.tungtt.basemvpimpl.ui;

import com.tungtt.basemvp.mvp.model.IBaseModelLayer;
import com.tungtt.basemvp.mvp.presenter.IBasePresenterLayer;
import com.tungtt.basemvp.mvp.view.IBaseViewLayer;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:47
 */
public interface IMainContract {
    interface Model extends IBaseModelLayer<Presenter> {
        boolean isEven();
    }

    interface View extends IBaseViewLayer<Presenter> {
        void updateText(String text);
    }

    interface Presenter extends IBasePresenterLayer<View, Model> {
        void onTvClicked();
    }
}
