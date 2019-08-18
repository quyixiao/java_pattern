package com.pattern.multiton;

public class Client {


    // 多例的实例数目并不需要有上限，实例数目没有上限的多例模式就叫做地铁上限多例模式
    // 由于没有上限
    // 一个resource 文件是一个简单的文本文件，一个resource 文件的名则是java 程序在调用此文件时使用的文件名
    // 一个resource文件和一个普通的properties文件并无本质的区别，java语言对两者支持是有区别的，java.util.Properties类不支持多语言
    // 而java.util.ResourceBundle类则支持多种语言
    // 当Locale代码是zh_CH时，Resource文件的文件名应当是短文件史加上Locale代码，就是zh_CH
    // 那么怎样的使用Local 对象和ResourceBundle读取一个Resource文件呢？代码清单如下图所示
    // Locale locale = new Locale("fr","FR");
    // ResourceBundle res = ResourceBundle.getBundle("shortname",locale);
    // 在上面的例子里，res对象会加载一个名为shortname_fr_FR.properties 的Resource文件
    //
    private static  Die die1 ,die2;

    public static void main(String[] args) {
        die1 = Die.getInstance(1);
        die2 = Die.getInstance(2);
        System.out.println( die1.dice());
        System.out.println(  die2.dice());
    }
}
