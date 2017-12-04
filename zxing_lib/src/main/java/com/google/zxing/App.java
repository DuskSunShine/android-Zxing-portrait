package com.google.zxing;

import android.app.Application;

/**
 * Created by SCY on 2017/12/3 23:25.
 */

public class App extends Application {
    private boolean clickToTakePicture=false;
    private static App myApplication = null;
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static App getApplication(){
        if (myApplication == null){
            myApplication = new App();
        }
        return myApplication;
    }

    public boolean isClickToTakePicture() {
        return clickToTakePicture;
    }

    public void setClickToTakePicture(boolean clickToTakePicture) {
        this.clickToTakePicture = clickToTakePicture;
    }
}
