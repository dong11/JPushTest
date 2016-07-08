package com.rex.hwong.test;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/7/8
 * @time 下午2:28
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
