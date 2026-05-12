package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void getValue_ValueDecreaseBaseOnYear_ValueDecreases(){
        //Arrange
        Vehicle car = new Vehicle("sad", "asd", 100, "volswagen jetta", 2020, 5000);
        double expectedPrice = 100 * .94;
        expectedPrice *= .94;
        expectedPrice *= .94;

        //Act
        double actualPrice = car.getValue();

        //Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void getValue_ExtraDecreaseBasedOnMilage_ValueDecreases(){
        //Arrange
        Vehicle car = new Vehicle("sad", "asd", 100, "volswagen jetta", 2026, 105000);
        double expectedPrice = 100 * .75;

        //Act
        double actualPrice = car.getValue();

        //Assert
        assertEquals(expectedPrice, actualPrice);


    }

    @Test
    public void getValue_NoMilageReductionBasedOnCarMake_ValueRemainsSame(){
        //Arrange
        Vehicle car = new Vehicle("sad", "asd", 100, "honda jetta", 2026, 105000);
        Vehicle car2 = new Vehicle("sad", "asd", 100, "Toyota jetta", 2026, 105000);
        double expectedPrice = 100;

        //Act
        double actualPrice = car.getValue();
        double actualPrice2 = car2.getValue();

        //Assert
        assertEquals(expectedPrice, actualPrice);
        assertEquals(expectedPrice, actualPrice2);


    }
}