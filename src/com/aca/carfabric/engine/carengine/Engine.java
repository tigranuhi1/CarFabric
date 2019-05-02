package com.aca.carfabric.engine.carengine;

import com.aca.carfabric.engine.HasPrice;

public abstract class Engine implements HasPrice {
    protected Double price = 0d;

    @Override
    public Double getPrice() {
        return price;
    }
}
