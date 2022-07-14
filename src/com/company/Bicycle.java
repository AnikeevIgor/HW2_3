package com.company;

public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check1() {
        super.check1();
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}