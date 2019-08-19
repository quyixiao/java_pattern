package com.pattern.resource;

import java.text.NumberFormat;
import java.util.Locale;


// 多例模式往往持有一个内蕴状态，多例类的每一个都有独特的内蕴状态，一个多例类持有一个聚集对象，用来登记自身的多例，而其内蕴
// 往往是登记的键值，当客户通过多例的静态工厂方法请求多个类的实例时，这个工厂方法都会聚集内查询是否已经有一个这样的实例，如果有
// 就直接返回给客户端，如果没有，就首先创建一个这样的实例，交之登记到聚集中，然后再向客户端提供，
// 关于多例模式以及它的单例模式的关系，读者参考本书的专题多例模式与多语言支持一
public class PercentNumberFormatTester {


    // 对货币数字格式的支持，下面给出的就是对倾向数字格模式的支持的解答的类图
    static public void displayNumber(Double amount, Locale currentLocale){
        NumberFormat format;
        String amountOut;

        format = NumberFormat.getPercentInstance(currentLocale);

        amountOut = format.format(amount);
        System.out.println(amountOut + "   "+ currentLocale.toString());

    }


    public static void main(String[] args) throws Exception {
        displayNumber(new Double(1234567.89),new Locale("en","US"));
        displayNumber(new Double(1234567.89),new Locale("de","DE"));
        displayNumber(new Double(1234567.89),new Locale("fr","FR"));
    }

}
