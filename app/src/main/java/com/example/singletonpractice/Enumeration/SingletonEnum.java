package com.example.singletonpractice.Enumeration;

import android.util.Log;

/**
 * Created by W on 2018/12/15.
 */

public enum SingletonEnum {
    INSTANCE;
    public void doSomething(){
        Log.d("SingletonEnum", "doSomething: ");

    }
}
