package com.pluralsight;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int lotSize, int squareFoot) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lootSize) {
        this.lotSize = lootSize;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    @Override
    public double getValue() {
        double price;
        switch (getCondition()) {
            case 1 -> price = getSquareFoot() * 180;
            case 2 -> price = getSquareFoot() * 130;
            case 3 -> price = getSquareFoot() * 90;
            case 4 -> price = getSquareFoot() * 80;
            default -> {
                System.out.println("Invalid condition");
                return 0;
            }
        }
        return price + (lotSize * .25);
    }
}
