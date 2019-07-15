package com.pattern.factory;

public class ConcreateCreate2 implements Creator {
    @Override
    public Product factory() {
        return new ConcreateProduct2();
    }
}
