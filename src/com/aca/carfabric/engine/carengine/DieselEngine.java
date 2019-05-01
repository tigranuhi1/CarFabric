package com.aca.carfabric.engine.carengine;

public class DieselEngine extends Engine{
    private final Double price = 2000d;

    @Override
    public Double getPrice() {
        return price;
    }
}
