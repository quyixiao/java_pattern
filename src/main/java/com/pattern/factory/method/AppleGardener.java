package com.pattern.factory.method;

import com.pattern.fruit.Apple;
import com.pattern.fruit.Fruit;

public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
