package com.pattern.abstractfactory;

/***
 * 在本例中有两个产品等级结构，而每个产品等级结构中又恰好有两个产品，也就是有两个产品族。因此，工厂等级结构中就会出现两个具体工厂
 * （对应于两个产品族）；而每个工厂类中又有两个工厂方法（对应于两个产品等级结构）。
 在真实的系统中，产品等级结构的数目与每个产品等级结构中产品的数目（也就是产品族的数目）一-般是不相等的。
 */
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
