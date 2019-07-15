package com.pattern.factory;

public class ConcreateProduct2 extends AbstractProduct implements Product {

    public ConcreateProduct2(){

        System.out.println("ConcreateProduct2");
    }

    @Override
    public void productFruit() {
        System.out.println("苹果");
    }
}
