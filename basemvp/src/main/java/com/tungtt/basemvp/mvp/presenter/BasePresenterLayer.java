package com.tungtt.basemvp.mvp.presenter;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.tungtt.basemvp.mvp.model.IBaseModelLayer;
import com.tungtt.basemvp.mvp.view.IBaseViewLayer;
import com.tungtt.basemvp.ui.SimpleFragment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:32
 */
public abstract class BasePresenterLayer<V extends IBaseViewLayer, M extends IBaseModelLayer>
        extends SimpleFragment
        implements IBasePresenterLayer<V, M> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BUNDLE_KEY {
        String TAG_SCREEN = "tag_screen";
    }

    private V mView;
    private M mModel;
    private String mTagScreen;

    @Override
    public int getLayoutRes() {
        return mView.getLayoutRes();
    }

    @Override
    public void back() {
        if (getActivity() != null) {
            if (mTagScreen == null || 0 == mTagScreen.trim().length()) {
                getActivity().getSupportFragmentManager().popBackStack();
            } else {
                getActivity().getSupportFragmentManager().popBackStack(mTagScreen, POP_BACK_STACK_INCLUSIVE);
            }
        }
    }

    @Override
    public void setTagScreen(@NonNull Bundle data) {
        mTagScreen = data.getString(BUNDLE_KEY.TAG_SCREEN, "");
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
