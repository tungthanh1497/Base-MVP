package com.tungtt.basemvpimpl.ui;

import com.tungtt.basemvp.mvp.model.BaseModelLayer;

import java.util.Random;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Wed, 21 Oct 2020 - 16:47
 */
public class MainModel extends BaseModelLayer<IMainContract.Presenter>
        implements IMainContract.Model {

    public static MainModel newInstance() {
        return new MainModel();
    }

    @Override
    public void init() {

    }

    public boolean isEven() {
        int random = new Random().nextInt(10);
        return random % 2 == 0;
    }
}
