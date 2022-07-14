package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Transport car = new Car("car1", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck1", 6);
        Transport truck2 = new Truck("truck2", 8);

        Transport bicycle = new Bicycle("bicycle1", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);


        List<Transport> bibika = Arrays.asList(bicycle, car, truck);
        for (Garaj g : bibika) {
            g.check1();
        }

        ServiceStation station = new ServiceStation();
        station.check((Car) car);

        station.check((Bicycle) bicycle);

        station.check((Truck) truck2);
    }
}

