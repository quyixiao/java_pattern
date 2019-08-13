package com.pattern.classloader;

import java.io.*;


/***
 * 启动类加载器，加载成功，就加载，如果没有加载成功，
 *
 *
 * 类的加载，连接，初始化
 * 加载，查找并加载类的二进制数据
 * 连接
 *  验证：确保被加载的类的正确性
 *  准备：为类的静态变量分配内存，并将其初始化为默认值
 *  解析：把类中的符号引用转换成直接引用
 * 初始化：为类的静态变量赋予正确的初始值
 *
 *
 *  同时，熟悉模版方法桃花戒指 读者可以看出同，getDefalutToolkie()方法实际上是一个模版方法，私有构造子的推迟到了子类的实现剩余的逻辑
 *  根据子类对这个剩余逻辑的不同的实现，子类就可以提供完全不同的行为，对Toolkit的子类而言，私有构造子的依赖于操作系统
 *  不同的子类可以根据不同的操作系统而给出不同的逻辑，从而使得Toolkit的子类对不同的操作系统给出不同的行为
 *  不完全的单例类
 *  估计有些读者见过下面的这个的不完全的单例类，如下代码所示
 *
 */
public class MyTest16 extends ClassLoader {

    private String classLoaderName;

    private final String fileExtonsion = ".class";

    public MyTest16(String classLoaderName) {
        super();            //将系统类加载器当做该类的加载器的父类加载器
        this.classLoaderName = classLoaderName;
    }


    public MyTest16(ClassLoader classLoader, String classLoaderName) {
        super(classLoader); // 显示的指定该类的类加载器
        this.classLoaderName = classLoaderName;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = this.loadClassData(name);
        return this.defineClass(name, data, 0, data.length);
    }

    // 根据名字找到对应的名字，返回一个字节数组，loadData无非就是一个io的操作，
    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        try {
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            is = new FileInputStream(new File(name + this.fileExtonsion));
            int ch;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray(); // 转换成一个字节数组，全部是一个io操作，字节数组，想要指定好的一个
            // 字节数组转换成一个class对象，defineClass 接收的是
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return data;
    }

    public static void test(ClassLoader classLoader) throws Exception{
        Class<?> clazz = classLoader.loadClass("com.pattern.classloader.ClassLoaderTest");
        Object object = clazz.newInstance();
        System.out.println(object);
    }


    public static void main(String[] args) throws Exception{
        MyTest16 myTest16 = new MyTest16("Loader233232");
        test(myTest16);
    }
}
