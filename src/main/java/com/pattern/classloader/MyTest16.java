package com.pattern.classloader;

import java.io.*;


/***
 * 启动类加载器，加载成功，就加载，如果没有加载成功，
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


    private byte[] loadClassData(String name) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        try {
            this.classLoaderName = this.classLoaderName.replace(".", "/");
            is = new FileInputStream(new File(name + this.fileExtonsion));
            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
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
