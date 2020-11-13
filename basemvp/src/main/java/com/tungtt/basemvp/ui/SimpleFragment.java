package com.tungtt.basemvp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class SimpleFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            setTagScreen(getArguments());
            onReceiveData(getArguments());
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        initViewModel();
        View view = inflater.inflate(getLayoutRes(), container, false);
        initialize(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void initialize(View view) {
        initView(view);
        initModel();
        init(view);
    }

    public abstract void initViewModel();

    public abstract @LayoutRes
    int getLayoutRes();

    public abstract void onReceiveData(@NonNull Bundle data);

    public abstract void initView(View view);

    public abstract void initModel();

    public abstract void init(View view);

    public abstract void setTagScreen(@NonNull Bundle data);

}