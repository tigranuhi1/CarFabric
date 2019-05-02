package com.aca.carfabric.engine.exterior;

import com.aca.carfabric.PriceCalculator;

public class ExteriorTest {
    public static void main(String[] args) {
        ExteriorTest test = new ExteriorTest();
        test.twoDoorsExteriorPriceTest();
        test.threeDoorsExteriorPriceTest();
        test.fourDoorsExteriorPriceTest();
        test.fiveDoorsExteriorPriceTest();
    }

    void twoDoorsExteriorPriceTest() {
        assert PriceCalculator.getPrice(new TwoDoorsExterior()).equals(2000d);
    }

    void threeDoorsExteriorPriceTest() {
        assert PriceCalculator.getPrice(new ThreeDoorExterior()).equals(3000d);
    }

    void fourDoorsExteriorPriceTest() {
        assert PriceCalculator.getPrice(new FourDoorExterior()).equals(4000d);
    }

    void fiveDoorsExteriorPriceTest() {
        assert PriceCalculator.getPrice(new FiveDoorExterior()).equals(5000d);
    }
}


