package com.aca.carfabric;

import com.aca.carfabric.engine.car.*;
import com.aca.carfabric.engine.carengine.*;
import com.aca.carfabric.engine.models.CarType;
import com.aca.carfabric.engine.models.EngineType;
import com.aca.carfabric.engine.models.WheelType;
import com.aca.carfabric.engine.wheel.AllDriveWheel;
import com.aca.carfabric.engine.wheel.BackDriveWheel;
import com.aca.carfabric.engine.wheel.FronDriveWheel;
import com.aca.carfabric.engine.wheel.Wheel;
import com.aca.carfabric.ui.GUI;
import com.aca.carfabric.ui.TerminalUI;
import com.aca.carfabric.ui.UI;
import com.aca.carfabric.ui.models.UIType;

public class CarFabric {
    UI ui;

    CarFabric(UIType uiType) {
        switch (uiType) {
            case TERMINAL:
                ui = new TerminalUI();
                break;
            case GUI:
                ui = new GUI();
                break;
            default:
                throw new IllegalArgumentException("Undefined user interface");
        }
    }

    Car produceCar() {
        ui.askForCarType();
        CarType carType = ui.getCarType();

        ui.askForEngineType();
        Engine engine = produceEngine(ui.getEngineType());

        ui.askForWheelType();
        Wheel wheel = produceWheel(ui.getWheelType());

        switch (carType) {
            case CROSSOVER:
                return new Crossover(engine, wheel);
            case SEDAN_SPORTCAR:
                return new SedanSport(engine, wheel);
            case SEDAN_BUISNESS:
                return new SedanBusiness(engine, wheel);
            case SEDAN_ELECTRICAL:
                return new SedanElectrical(engine, wheel);
            case HATCHBACK:
                return new Hatchback(engine, wheel);
            case TRUCK:
                return new Truck(engine, wheel);
            case TRACTOR:
                return new Tractor(engine, wheel);
            case MOTORCYCLE:
                return new Motorcycle(engine, wheel);
            default:
                throw new IllegalArgumentException("Incorrect car type.");
        }
    }

    Engine produceEngine(EngineType engineType) {
        switch (engineType) {
            case ELECTRICAL:
                return new ElectricalEngine();
            case DIESEL:
                return new DieselEngine();
            case PETROL:
                return new PetrolEngine();
            case HYBRID:
                return new HybridEngine();
            default:
                throw new IllegalArgumentException("Incorrect engine type");
        }
    }

    Wheel produceWheel(WheelType wheelType) {
        switch (wheelType) {
            case ALL_WHEEELS_DRIVE:
                return new AllDriveWheel();
            case FRONT_WHEELS_DRIVE:
                return new FronDriveWheel();
            case BACK_WHEELS_DRIVE:
                return new BackDriveWheel();
            default:
                throw new IllegalArgumentException("Incorrect wheel type");
        }
    }
}
