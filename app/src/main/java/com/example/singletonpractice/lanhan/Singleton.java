package com.example.singletonpractice.lanhan;

/**
 * Created by W on 2018/12/14.
 */

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
