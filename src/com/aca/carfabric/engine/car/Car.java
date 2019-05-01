package com.aca.carfabric.engine.car;

import com.aca.carfabric.engine.HasPrice;
import com.aca.carfabric.engine.carengine.Engine;
import com.aca.carfabric.engine.wheel.Wheel;

public abstract class Car implements HasPrice {
    protected Engine engine;
    protected Wheel wheel;

    public abstract Double getPrice();

}
