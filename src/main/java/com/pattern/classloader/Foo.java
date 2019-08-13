package com.pattern.classloader;


public class Foo {


    private com.pattern.classloader.Helper helper;

    public Helper getHelper() {
        if(helper == null){
            helper = new Helper();
        }
        return helper;

    }
}
