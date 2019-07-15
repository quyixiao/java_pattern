package com.pattern.factory;

public class Client {


    private static Creator creator1,creator2;
    private static Product product1,product2;

    public static void main(String[] args) {

        creator1 = new ConcreateCreate1();

        creator2 = new ConcreateCreate2();

        product1 = creator1.factory();

        product1.productFruit();

        product2 = creator2.factory();
        product2.productFruit();

    }
}
