package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Asset> assets = new ArrayList<>();

        House mainHouse = new House("my house", "01/01/2020", 500000, "123 main st", 1, 100000, 5000);
        House vacationHome = new House("Beach House", "10/12/2022", 900000, "567 beach haven rd", 2, 500000, 9000);
        Vehicle sportsCar = new Vehicle("Mason's Daily", "09/04/2026", 32000, "Honda Civic si", 2026, 100);
        Vehicle oldCar = new Vehicle("Mason's old car", "08/10/2010", 5000, "Volkswagen Jetta", 2010, 190000);

        assets.add(mainHouse);
        assets.add(vacationHome);
        assets.add(sportsCar);
        assets.add(oldCar);

        for(Asset a: assets){
            System.out.println(a.getValue());
        }

        for(Asset a: assets){
            if (a instanceof House){
                System.out.println("House at " + ((House) a).getAddress());
            } else if (a instanceof Vehicle){
                System.out.println(("Vehicle: " + ((Vehicle) a).getYear()) + " " + ((Vehicle) a).getMakeModel());
            }
        }
    }
}
