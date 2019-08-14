package com.pattern.classloader;

public class Foo1 {


    private Helper helper = null;

    public Helper getHelper() {

        if(helper == null ){        //第一次检查位置
            synchronized (this){   // 这里会有多于一个线程同时到达的位置
                if(helper == null ){ // 第二将检查

                    helper = new Helper();
                }
            }

        }

        return helper;
    }
}
