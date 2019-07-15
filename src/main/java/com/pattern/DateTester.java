package com.pattern;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/***
 * 从上面的例子中可以看出，由于使用简单的工厂模式，客户端完全不必操心工厂方法所返回的对象是怎样创建和构成的，工厂方法将实例化哪些对象以及
 * 如何实例化这些对象的细节隐藏起来，使得对这些对象的使用得到简化，
 * 与一般的简单工厂模式不同的地方在于角色与抽象产品角色合并成一个类，抽象产品角色负责具体的产品创建，这是简单的工厂模式的一个特例
 *
 *
 */
public class DateTester {


    public static void main(String[] args) throws Exception {
        Locale local = Locale.FRENCH;
        Date date = new Date();
        String now = DateFormat.getTimeInstance(DateFormat.DEFAULT, local).format(date);
        System.out.println(now);

        try {

            date = DateFormat.getDateInstance(DateFormat.DEFAULT, local).parse("16 nov.01");
            System.out.println(date);

        } catch (Exception e) {
            System.out.println("Parsing excetpion " + e);
        }

    }
}
