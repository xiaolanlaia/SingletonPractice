package com.example.singletonpractice.ehan;

/**
 * Created by W on 2018/12/14.
 */

public class CEO extends Staff {
    private static final CEO mCeo = new CEO();

    /**
     * 构造函数私有
     */
    private CEO(){

    }
    /**
     * 公有静态函数，对外暴露获取单例对象的接口
     */
    public static CEO getmCeo(){
        return mCeo;
    }
    @Override
    public void work(){
        //管理VP
    }
}
