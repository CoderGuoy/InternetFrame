package com.coderguoy.internetframe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.coderguoy.internetframe.ui.Fragment1;
import com.coderguoy.internetframe.ui.Fragment2;
import com.coderguoy.internetframe.ui.Fragment3;
import com.coderguoy.internetframe.ui.Fragment4;
import com.coderguoy.internetframe.ui.Fragment5;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    public List<Fragment> fragments = new ArrayList<Fragment>();
    private ImageView zxing;
    public String where;
    public String id;

    public String getWhere() {
        return where;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadioGroup = (RadioGroup) findViewById(R.id.tabs_rg);
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
        fragments.add(new Fragment5());

        FragmentTabAdapter tabAdapter = new FragmentTabAdapter(this, fragments, R.id.tab_content, mRadioGroup);
        tabAdapter.setOnRgsExtraCheckedChangedListener(new FragmentTabAdapter.OnRgsExtraCheckedChangedListener() {
            @Override
            public void OnRgsExtraCheckedChanged(RadioGroup radioGroup, int checkedId, int index) {
            }
        });
    }
}
