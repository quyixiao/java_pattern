package com.pattern.resource;

import java.text.NumberFormat;
import java.util.Locale;

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
