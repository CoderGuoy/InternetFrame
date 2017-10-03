package com.coderguoy.internetframe.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.coderguoy.internetframe.base.MvvmBaseFragment;
import com.coderguoy.internetframe.R;
import com.coderguoy.internetframe.databinding.Fragment2Binding;


public class Fragment2 extends MvvmBaseFragment<Fragment2Binding> {

    @Override
    public int setContent() {
        return R.layout.fragment_2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showContentView();
        bindingView.textview.setText(getString(R.string.Tab2));
    }
}
