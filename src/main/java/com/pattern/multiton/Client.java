package com.pattern.multiton;

public class Client {


    private static  Die die1 ,die2;

    public static void main(String[] args) {
        die1 = Die.getInstance(1);
        die2 = Die.getInstance(2);
        System.out.println( die1.dice());
        System.out.println(  die2.dice());
    }
}
