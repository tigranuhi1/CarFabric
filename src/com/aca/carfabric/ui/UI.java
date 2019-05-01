package com.aca.carfabric.ui;

import com.aca.carfabric.engine.models.CarType;
import com.aca.carfabric.engine.models.EngineType;
import com.aca.carfabric.engine.models.WheelType;

public abstract class UI {
    public abstract void askForCarType();

    public abstract void askForWheelType();

    public abstract void askForEngineType();

    public abstract CarType getCarType();

    public abstract EngineType getEngineType();

    public abstract WheelType getWheelType();
}
