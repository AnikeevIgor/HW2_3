package com.company;

public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check1() {
        super.check1();
        for (int i = 0; i < getWheelsCount(); i++) {
                          updateTyre();
                      }
                      checkEngine();
                      checkTrailer();
    }
}
