package com.aca.carfabric.engine.car;

import com.aca.carfabric.engine.carengine.Engine;
import com.aca.carfabric.engine.wheel.Wheel;

public class Truck extends Car {
    private final Double price = 40000d;

    public Truck(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public Double getPrice(){
        return this.price + engine.getPrice() + wheel.getPrice();
    }
}
