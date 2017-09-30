package com.coderguoy.internetframe.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.coderguoy.internetframe.MvvmBaseFragment;
import com.coderguoy.internetframe.R;
import com.coderguoy.internetframe.databinding.Fragment5Binding;


public class Fragment5 extends MvvmBaseFragment<Fragment5Binding> {

    @Override
    public int setContent() {
        return R.layout.fragment_5;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showContentView();
        bindingView.textview.setText("我的");
    }
}
