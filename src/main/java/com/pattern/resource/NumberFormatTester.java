package com.pattern.resource;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTester {


    static public void displayNumber(Double amount, Locale currentLocale){
        NumberFormat format;
        String amountOut;

        format = NumberFormat.getNumberInstance(currentLocale);

        amountOut = format.format(amount);
        System.out.println(amountOut + "   "+ currentLocale.toString());

    }


    public static void main(String[] args) throws Exception {
        displayNumber(new Double(1234567.89),new Locale("en","US"));
        displayNumber(new Double(1234567.89),new Locale("de","DE"));
        displayNumber(new Double(1234567.89),new Locale("fr","FR"));
    }

}
