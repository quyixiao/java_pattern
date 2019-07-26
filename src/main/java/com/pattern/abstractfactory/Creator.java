package com.pattern.abstractfactory;

interface Creator {

    /**
     * 产品等级结构 A 的工厂方法
     */

    public ProductA factoryA();

    /**
     * 产品等级结构 B 的工厂方法
     */

    public ProductB factoryB();

}