package com.aca.carfabric.engine.wheel;

import com.aca.carfabric.engine.HasPrice;

public abstract class Wheel implements HasPrice {
    protected Double price = 0d;

    @Override
    public Double getPrice() {
        return price;
    }
}
