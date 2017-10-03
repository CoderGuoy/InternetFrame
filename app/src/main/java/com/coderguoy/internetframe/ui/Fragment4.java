package com.coderguoy.internetframe.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.coderguoy.internetframe.base.MvvmBaseFragment;
import com.coderguoy.internetframe.R;
import com.coderguoy.internetframe.databinding.Fragment4Binding;


public class Fragment4 extends MvvmBaseFragment<Fragment4Binding> {

    @Override
    public int setContent() {
        return R.layout.fragment_4;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showContentView();
        bindingView.textview.setText("tab3");
    }
}
