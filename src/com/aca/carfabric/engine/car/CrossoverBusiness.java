package com.aca.carfabric.engine.car;

import com.aca.carfabric.engine.carengine.Engine;
import com.aca.carfabric.engine.exterior.Exterior;
import com.aca.carfabric.engine.interior.Interior;
import com.aca.carfabric.engine.wheel.Wheel;

public class CrossoverBusiness extends Car{
    public CrossoverBusiness(Engine engine, Wheel wheel, Interior interior, Exterior exterior) {
        price = 35000d;
        this.engine = engine;
        this.wheel = wheel;
        this.interior = interior;
        this.exterior = exterior;
    }
}

