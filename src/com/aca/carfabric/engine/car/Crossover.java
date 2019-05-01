package com.aca.carfabric.engine.car;

import com.aca.carfabric.engine.carengine.Engine;
import com.aca.carfabric.engine.wheel.Wheel;

public class Crossover extends Car {
    private final Double price = 20000d;

    public Crossover(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public Double getPrice(){
        return this.price + engine.getPrice() + wheel.getPrice();
    }
}
