package com.aca.carfabric.engine.carengine;

public class ElectricalEngine extends Engine {
    private final Double price = 10000d;

    @Override
    public Double getPrice() {
        return price;
    }

}
