package com.pattern.factory.method;

import com.pattern.fruit.Apple;
import com.pattern.fruit.Fruit;

public class StrawberryGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
