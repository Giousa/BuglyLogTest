package com.zmm.buglylogtest;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/5/23
 * Time:下午2:18
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "900037004", true);

    }
}
