package com.aca.carfabric.ui;

import com.aca.carfabric.engine.models.*;

public abstract class UI {
    public abstract void askForCarType();

    public abstract void askForWheelType();

    public abstract void askForEngineType();

    public abstract void askForInteriorType();

    public abstract void askForExteriorType();

    public abstract CarType getCarType();

    public abstract EngineType getEngineType();

    public abstract WheelType getWheelType();

    public abstract InteriorType getInteriorType();

    public abstract ExteriorType getExteriorType();
}
