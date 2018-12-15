package com.example.singletonpractice.StaticInnerSingleton;

/**
 * Created by W on 2018/12/15.
 */

public class Singleton {
    private  Singleton(){}
    public static Singleton getInstance(){
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }

}
