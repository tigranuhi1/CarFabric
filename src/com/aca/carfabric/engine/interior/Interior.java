package com.aca.carfabric.engine.interior;

import com.aca.carfabric.engine.HasPrice;

public abstract class Interior implements HasPrice {
    protected Double price = 0d;

    @Override
    public Double getPrice() {
        return price;
    }
}
