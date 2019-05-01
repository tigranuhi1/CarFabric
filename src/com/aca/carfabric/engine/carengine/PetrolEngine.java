package com.aca.carfabric.engine.carengine;

public class PetrolEngine extends Engine {
    private final Double price = 5000d;

    @Override
    public Double getPrice() {
        return price;
    }
}
