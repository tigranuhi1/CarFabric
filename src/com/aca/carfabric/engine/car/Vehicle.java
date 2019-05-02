package com.aca.carfabric.engine.car;

import com.aca.carfabric.engine.HasPrice;
import com.aca.carfabric.engine.carengine.Engine;
import com.aca.carfabric.engine.exterior.Exterior;
import com.aca.carfabric.engine.interior.Interior;
import com.aca.carfabric.engine.wheel.Wheel;

public abstract class Vehicle implements HasPrice {
    protected Double price = 0d;
    protected Engine engine;
    protected Wheel wheel;
    protected Interior interior;
    protected Exterior exterior;

    @Override
    public Double getPrice(){
        return price + engine.getPrice() + wheel.getPrice()+ interior.getPrice() + exterior.getPrice();
    }

}
