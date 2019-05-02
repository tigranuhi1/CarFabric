package com.aca.carfabric;

import com.aca.carfabric.engine.car.*;
import com.aca.carfabric.engine.carengine.*;
import com.aca.carfabric.engine.exterior.*;
import com.aca.carfabric.engine.interior.ClothInterior;
import com.aca.carfabric.engine.interior.Interior;
import com.aca.carfabric.engine.interior.LeatherInterior;
import com.aca.carfabric.engine.models.*;
import com.aca.carfabric.engine.wheel.AllDriveWheel;
import com.aca.carfabric.engine.wheel.BackDriveWheel;
import com.aca.carfabric.engine.wheel.FrontDriveWheel;
import com.aca.carfabric.engine.wheel.Wheel;
import com.aca.carfabric.ui.GUI;
import com.aca.carfabric.ui.TerminalUI;
import com.aca.carfabric.ui.UI;
import com.aca.carfabric.ui.models.UIType;

public class CarFabric {
    private UI ui;

    public CarFabric(UIType uiType) {
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

    public Vehicle produceVehicle() {
        ui.askForCarType();
        CarType carType = ui.getCarType();

        ui.askForEngineType();
        Engine engine = produceEngine(ui.getEngineType());

        ui.askForWheelType();
        Wheel wheel = produceWheel(ui.getWheelType());

        ui.askForInteriorType();
        Interior interior = produceInterior(ui.getInteriorType());

        Exterior exterior = null;
        if(!carType.equals(CarType.MOTORCYCLE)) {
            ui.askForExteriorType();
            exterior = produceExterior(ui.getExteriorType());
        }

        switch (carType) {
            case CROSSOVER_SPORT:
                return new CrossoverSport(engine, wheel, interior, exterior);
            case CROSSOVER_BUSINESS:
                return new CrossoverBusiness(engine, wheel, interior, exterior);
            case CROSSOVER_ECONOM:
                return new CrossoverEconom(engine, wheel, interior, exterior);
            case SEDAN_SPORT:
                return new SedanSport(engine, wheel, interior, exterior);
            case SEDAN_BUSINESS:
                return new SedanBusiness(engine, wheel, interior, exterior);
            case SEDAN_ECONOM:
                return new SedanEconom(engine, wheel, interior, exterior);
            case HATCHBACK_SPORT:
                return new HatchbackSport(engine, wheel, interior, exterior);
            case HATCHBACK_BUSINESS:
                return new HatchbackBusiness(engine, wheel, interior, exterior);
            case HATCHBACK_ECONOM:
                return new HatchbackEconom(engine, wheel, interior, exterior);
            case TRUCK:
                return new Truck(engine, wheel, interior, exterior);
            case TRACTOR:
                return new Tractor(engine, wheel, interior, exterior);
            case MOTORCYCLE:
                return new Motorcycle(engine, wheel, interior);
            default:
                throw new IllegalArgumentException("Incorrect car type.");
        }
    }

    private Exterior produceExterior(ExteriorType exteriorType) {
        switch (exteriorType) {
            case TWO_DOORS:
                return new TwoDoorsExterior();
            case THREE_DOORS:
                return new ThreeDoorExterior();
            case FOUR_DOORS:
                return new FourDoorExterior();
            case FIVE_DOORS:
                return new FiveDoorExterior();
            default:
                throw new IllegalArgumentException("Incorrect exterior type.");
        }
    }

    private Interior produceInterior(InteriorType interiorType) {
        switch (interiorType) {
            case LEATHER_SALON:
                return new LeatherInterior();
            case CLOTH_SALON:
                return new ClothInterior();
            default:
                throw new IllegalArgumentException("Incorrect interior type");
        }
    }

    private Engine produceEngine(EngineType engineType) {
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

    private Wheel produceWheel(WheelType wheelType) {
        switch (wheelType) {
            case ALL_WHEEELS_DRIVE:
                return new AllDriveWheel();
            case FRONT_WHEELS_DRIVE:
                return new FrontDriveWheel();
            case BACK_WHEELS_DRIVE:
                return new BackDriveWheel();
            default:
                throw new IllegalArgumentException("Incorrect wheel type");
        }
    }
}
