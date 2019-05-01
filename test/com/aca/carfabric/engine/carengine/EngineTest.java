package com.aca.carfabric.engine.carengine;

import com.aca.carfabric.PriceCalculator;

public class EngineTest {
    public static void main(String[] args) {
        EngineTest test = new EngineTest();
        test.dieselEnginePriceTest();
        test.electricalEnginePriceTest();
        test.hybridEnginePriceTest();
        test.petrolEnginePriceTest();
    }

    void dieselEnginePriceTest(){
        assert PriceCalculator.getPrice(new DieselEngine()).equals(2000d);
    }
    void petrolEnginePriceTest(){
        assert PriceCalculator.getPrice(new DieselEngine()).equals(5000d);
    }
    void hybridEnginePriceTest(){
        assert PriceCalculator.getPrice(new DieselEngine()).equals(4000d);
    }
    void electricalEnginePriceTest(){
        assert PriceCalculator.getPrice(new DieselEngine()).equals(10000d);
    }
}
