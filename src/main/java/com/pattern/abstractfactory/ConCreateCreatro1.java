package com.pattern.abstractfactory;

public class ConCreateCreatro1 implements Creator {
    @Override
    public ProductA factoryA() {

        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
