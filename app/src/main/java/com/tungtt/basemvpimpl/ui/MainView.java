package com.tungtt.basemvpimpl.ui;

import android.view.View;
import android.widget.TextView;

import com.tungtt.basemvp.mvp.view.BaseViewLayer;
import com.tungtt.basemvpimpl.R;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:47
 */
public class MainView extends BaseViewLayer<IMainContract.Presenter>
        implements IMainContract.View {

    private TextView tv;

    public static MainView newInstance() {
        return new MainView();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.main_fragment;
    }

    @Override
    public void bindViews(View view) {
        tv = view.findViewById(R.id.message);
    }

    @Override
    public void init() {
        implementListeners();
    }

    private void implementListeners() {
        tv.setOnClickListener(v -> mPresenter().onTvClicked());
    }

    @Override
    public void updateText(String text) {
        tv.setText(text);
    }
}
