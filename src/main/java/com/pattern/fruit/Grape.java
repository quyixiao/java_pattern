package com.pattern.fruit;

public class Grape implements Fruit {

    private boolean seedless;


    @Override
    public void grow() {

    }

    @Override
    public void harvest() {

    }

    @Override
    public void plant() {

    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
