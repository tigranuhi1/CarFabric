package com.aca.carfabric.engine.interior;

import com.aca.carfabric.PriceCalculator;

public class InteriorTest {
    public static void main(String[] args) {
        InteriorTest test = new InteriorTest();
        test.leatherInteriorPriceTest();
        test.clothInteriorPriceTest();
    }

    void leatherInteriorPriceTest(){
        assert PriceCalculator.getPrice(new LeatherInterior()).equals(2000d);
    }

    void clothInteriorPriceTest(){
        assert PriceCalculator.getPrice(new ClothInterior()).equals(1000d);

    }
}
