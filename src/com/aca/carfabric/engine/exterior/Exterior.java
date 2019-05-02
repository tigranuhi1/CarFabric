package com.aca.carfabric.engine.exterior;

import com.aca.carfabric.engine.HasPrice;

public class Exterior implements HasPrice {
    protected Double price = 0d;

    @Override
    public Double getPrice() {
        return price;
    }
}
