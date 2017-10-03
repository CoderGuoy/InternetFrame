package com.coderguoy.internetframe.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.coderguoy.internetframe.base.MvvmBaseFragment;
import com.coderguoy.internetframe.R;
import com.coderguoy.internetframe.databinding.Fragment1Binding;


public class Fragment1 extends MvvmBaseFragment<Fragment1Binding> {

    @Override
    public int setContent() {
        return R.layout.fragment_1;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showContentView();
        bindingView.textview.setText("首页");
    }
}
