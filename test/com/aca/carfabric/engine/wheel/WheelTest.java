package com.aca.carfabric.engine.wheel;

import com.aca.carfabric.PriceCalculator;

public class WheelTest {
    public static void main(String[] args) {
        WheelTest wheelTest = new WheelTest();
        wheelTest.allDriveWheelPriceTest();
        wheelTest.frontDriveWheelPriceTest();
        wheelTest.backDriveWheelPriceTest();
    }

    void allDriveWheelPriceTest() {
        assert PriceCalculator.getPrice(new AllDriveWheel()).equals(8000d);
    }

    void frontDriveWheelPriceTest() {
        assert PriceCalculator.getPrice(new FronDriveWheel()).equals(4000d);
    }

    void backDriveWheelPriceTest() {
        assert PriceCalculator.getPrice(new BackDriveWheel()).equals(3000d);
    }
}
