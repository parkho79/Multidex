package com.parkho.multidex;

import android.support.multidex.MultiDexApplication;
import android.util.Log;

public class PhApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("parkho", "앗싸!");
    }
}
