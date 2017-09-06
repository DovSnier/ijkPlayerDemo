package com.xcar.ijkplayerdemo;

import android.app.Application;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created by lzw on 2017/9/6.
 */
public class IjkApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    Logger.addLogAdapter(new AndroidLogAdapter());
  }
}
