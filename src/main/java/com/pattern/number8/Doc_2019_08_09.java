package com.pattern.number8;

public class Doc_2019_08_09 {

    // contains(Object value) ，containsKey(Object key) 如果给定的参数或者属性关键字在属性民表中的定义，该方法返回true ,
    // getProperty(String key) ,getProperty(String key,String default) 根据给定所属性一关键字获取关键的值
    // list(PrintStream s ),List(PrintWriter w): 输出流中的属性表中的内容
    // size(): 返回当前表中当前属性中关键字个数
    // put（Object key ,Object value） :向属性表中追加发生关键字的值
    // remove(Object key ) 从属性中删除关键字
    // 从属性文件中方法load(InputStream inStream)，可以从一个输入流中读取一个属性列，如果这个流是来自于一个文件的话，这个方法就从文件中
    // 读入属性
    // 将属性存入属性文件的方法有几个，最重要一个是store(OutStream out,String header),将当前属性列写入一个输出流，如果这个输出流
    // 导向一个文件的，那么这个方法将属性流存入文件
    // 将属性存入属性文件中的方法有几个，最重要的一个是store(OutStream out ,String header) ，将当前属性列属性列输出流，如果这个
    // 输出流，如果这个输出流是导向一个文件的，那么这个方法将属性流存入文件
    // 为什么呢？属性是系统的一种资源，应当避免有一个的对象读取，特别是存储属性，此外，属性的读取可能会在很多的地方发生，创建属性
    // 对象的地方应当在啊里不是很多清楚，换言之，属性管理应当自己创建自己的实例，并且自己的向系统例程提供这一个实例
    // 因此，属性民文件文件管理器应当是由一个单例模式负责的
    // 系统设计
    // 系统核心的是一个属性管理器，也就是一个叫做ConfigManager 的类，这个类应当是一个单例类，因此，这个类应当有一个静态工厂，不妨
    // 叫做自己的实例，
    // 为了简单起见，本书这里采取饿汉方式实现，ConfigManager ，例子的类下图，所示
    // 本例源代码如代码清单
    //
}
