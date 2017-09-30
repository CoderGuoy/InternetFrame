package com.coderguoy.internetframe;

import android.os.Environment;

import java.io.File;

public class Constants {

    //================= URL =====================
    //天狗
    public static final String TG_URL = "http://www.tngou.net/api/";

    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "code" + File.separator + "Menu";

}
