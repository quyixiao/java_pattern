package com.pattern.classloader;


public class Foo {


    // A会首先进入if(helper == null) 块的内部，并开始执行new Helper() 语句，此时，helper 变量仍然是null,直线线程A 的new Helper()语句
    // 返回并给helper 变量赋值
    // 但是，线程B并不会在if(helpr == null) 语句外面等待，因此，此时helper == null 成立的，它会马上if(helper == null) 语句外面等待
    // 因此时，helper 线程不会再进入if(helper == null)语句块的内部了，
    // 线程A 的helper =


    private com.pattern.classloader.Helper helper;

    public synchronized Helper getHelper() {
        if(helper == null){
            helper = new Helper();
        }
        return helper;

    }
}
