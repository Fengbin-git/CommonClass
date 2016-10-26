package com.fengbin.myviewtest;

import android.content.Context;

/**
 * 作者：冯彬 on 2016/9/14 0014 10:44
 * 邮箱：jinbindeveloper@gmail.com
 * 描述：
 */
public class DisplayUtil {
    /**
     * 将px转为dp，保证尺寸大小不变
     */
    public static int px2dp(Context context,float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue/scale + 0.5f);
    }
    /**
     * 将px转为sp，保证尺寸大小不变
     */
    public static int px2sp(Context context,float pxValue){
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(pxValue/scale + 0.5f);
    }
    /**
     * 将dp转为px，保证尺寸大小不变
     */
    public static int dp2px(Context context,float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue*scale + 0.5f);
    }
    /**
     * 将sp转为px，保证尺寸大小不变
     */
    public static int sp2px(Context context,float spValue){
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(spValue*scale + 0.5f);
    }
}
