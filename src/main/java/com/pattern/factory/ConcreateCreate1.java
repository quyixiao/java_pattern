package com.pattern.factory;

public class ConcreateCreate1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreateProduct1();
    }
}
