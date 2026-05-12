package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public double getValue() {
        int currentYear = LocalDate.now().getYear();
        int difference = currentYear - year;
        String lower = makeModel.toLowerCase();

        double price;

        switch (difference) {
            case 0, 1, 2, 3 -> price = getOriginalCost() * (1 - .03 * difference);
            case 4, 5, 6 -> price = getOriginalCost() * (1 - .06 * (difference - 3));
            case 7, 8, 9, 10 -> price = getOriginalCost() * (1 - .08 * (difference - 6));
            default -> price = 1000;
        }

        if (odometer > 100000 && !lower.contains("honda") && !lower.contains("toyota")) {
            return price * .75;
        } else {
            return price;
        }
    }
}
