package com.coderguoy.internetframe.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.coderguoy.internetframe.R;


/**
 * @Version:
 * @Author:
 * @CreateTime:
 * @Descrpiton:
 * @UpDateAuthor:
 * @UpDateTime:
 * @UpDataWhat:
 */
public class GlideUtils {

    public static void setImage(Context context, String url, ImageView imageview) {
        Glide.with(context).load(url)
                .placeholder(R.drawable.loading)    //加载中显示的图片
                .fallback(R.drawable.loading)        //默认图片
                .error(R.drawable.loadingfaile)     //加载失败显示的图片
                .crossFade()                        //渐显动画
                .centerCrop()
                .into(imageview);
    }


}
