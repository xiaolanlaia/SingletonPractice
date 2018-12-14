package com.example.singletonpractice.DoubleCheckLock;

import android.util.Log;

/**
 * Created by W on 2018/12/14.
 */

public class Singleton {
    private String TAG = "Singleton";
    private static Singleton sIngleton = null;
    private Singleton(){

    }
    public void doSomething(){
        Log.d(TAG, "doSomething: doSomething");
    }
    private static Singleton getInstance(){
        if (sIngleton == null){
            synchronized (Singleton.class){
                if (sIngleton == null){
                    sIngleton = new Singleton();
                }
            }
        }
        return sIngleton;
    }
}
