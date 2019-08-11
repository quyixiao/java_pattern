package com.pattern.classloader;

public class ClassLoaderTest {

    // 对于数组来说，这是一个字符串数组，不是由类加载器来加载的，
    public static void main(String[] args) {
        String[] strings = new String[2];
        System.out.println(strings.getClass().getClassLoader());

        // 自定义的类，整个数组由appclassLoader 数组对应的对象，由自定义的类来进行加载
        ClassLoaderTest[] mytest = new ClassLoaderTest[2];
        System.out.println(mytest.getClass().getClassLoader());

        //
        int [] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());


    }

}
