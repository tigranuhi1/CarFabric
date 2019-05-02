package com.aca.carfabric.engine.car;

import com.aca.carfabric.PriceCalculator;
import com.aca.carfabric.engine.carengine.DieselEngine;
import com.aca.carfabric.engine.carengine.ElectricalEngine;
import com.aca.carfabric.engine.carengine.HybridEngine;
import com.aca.carfabric.engine.carengine.PetrolEngine;
import com.aca.carfabric.engine.exterior.FiveDoorExterior;
import com.aca.carfabric.engine.exterior.FourDoorExterior;
import com.aca.carfabric.engine.exterior.ThreeDoorExterior;
import com.aca.carfabric.engine.exterior.TwoDoorsExterior;
import com.aca.carfabric.engine.interior.ClothInterior;
import com.aca.carfabric.engine.interior.LeatherInterior;
import com.aca.carfabric.engine.wheel.AllDriveWheel;
import com.aca.carfabric.engine.wheel.BackDriveWheel;
import com.aca.carfabric.engine.wheel.FrontDriveWheel;

public class CarTest {
    public static void main(String[] args) {
        CarTest carTest = new CarTest();
        carTest.crossoverSportPriceTest();
        carTest.crossoverBusinessPriceTest();
        carTest.crossoverEconomPriceTest();
        carTest.hatchBackSportPriceTest();
        carTest.hatchBackBusinessPriceTest();
        carTest.hatchBackEconomPriceTest();
        carTest.motorCyclePriceTest();
        carTest.sedanSportPriceTest();
        carTest.sedanBusinessPriceTest();
        carTest.sedanEconomPriceTest();
        carTest.tractorPriceTest();
        carTest.truckPriceTest();
    }

    void crossoverSportPriceTest() {
        Vehicle vehicle = new CrossoverSport(new PetrolEngine(),
                new AllDriveWheel(),
                new ClothInterior(),
                new ThreeDoorExterior());

        assert PriceCalculator.getPrice(vehicle).equals(47000d); //30000 + 5000 + 8000 + 1000 + 3000
    }

    void crossoverBusinessPriceTest() {
        Vehicle vehicle = new CrossoverEconom(new ElectricalEngine(),
                new BackDriveWheel(),
                new ClothInterior(),
                new FiveDoorExterior());

        assert PriceCalculator.getPrice(vehicle).equals(40000d); //20000 + 10000 + 4000 + 1000 + 5000
    }

    void crossoverEconomPriceTest() {
        Vehicle vehicle = new CrossoverEconom(new HybridEngine(),
                new BackDriveWheel(),
                new ClothInterior(),
                new FiveDoorExterior());

        assert PriceCalculator.getPrice(vehicle).equals(34000d); //20000 + 4000 + 4000 + 1000 + 5000
    }

    void hatchBackSportPriceTest() {
        Vehicle vehicle = new HatchbackSport(new PetrolEngine(),
                new AllDriveWheel(),
                new ClothInterior(),
                new ThreeDoorExterior());
        assert PriceCalculator.getPrice(vehicle).equals(39000d); //22000 + 5000 + 8000 + 1000 + 3000
    }

    void hatchBackBusinessPriceTest() {
        Vehicle vehicle = new HatchbackBusiness(new ElectricalEngine(),
                new AllDriveWheel(),
                new LeatherInterior(),
                new FiveDoorExterior());
        assert PriceCalculator.getPrice(vehicle).equals(50000d); //250000 + 10000 + 8000 + 2000 + 5000
    }

    void hatchBackEconomPriceTest() {
        Vehicle vehicle = new HatchbackEconom(new HybridEngine(),
                new BackDriveWheel(),
                new LeatherInterior(),
                new ThreeDoorExterior());
        assert PriceCalculator.getPrice(vehicle).equals(28000d); //15000 + 4000 + 4000 + 2000 + 3000
    }

    void sedanBusinessPriceTest() {
        Vehicle vehicle = new SedanBusiness(new PetrolEngine(),
                new AllDriveWheel(),
                new LeatherInterior(),
                new FourDoorExterior());
        assert PriceCalculator.getPrice(vehicle).equals(51000d); //32000 + 5000 + 8000 + 2000 + 4000
    }

    void sedanEconomPriceTest() {
        Vehicle vehicle = new SedanEconom(new HybridEngine(),
                new FrontDriveWheel(),
                new ClothInterior(),
                new FourDoorExterior());
        assert PriceCalculator.getPrice(vehicle).equals(35000d); //23000 + 4000 + 3000 + 1000 + 4000
    }

    void sedanSportPriceTest() {
        Vehicle vehicle = new SedanSport(new PetrolEngine(),
                new AllDriveWheel(),
                new ClothInterior(),
                new TwoDoorsExterior());
        assert PriceCalculator.getPrice(vehicle).equals(43000d); //27000 + 5000 + 8000 + 1000 + 2000
    }

    void motorCyclePriceTest() {
        Vehicle vehicle = new Motorcycle(new PetrolEngine(),
                new BackDriveWheel(),
                new LeatherInterior());
        assert PriceCalculator.getPrice(vehicle).equals(21000d); //10000 + 5000 + 4000 + 2000
    }

    void tractorPriceTest() {
        Vehicle vehicle = new Tractor(new DieselEngine(),
                new BackDriveWheel(),
                new ClothInterior(),
                new TwoDoorsExterior());
        assert PriceCalculator.getPrice(vehicle).equals(35000d); //26000 + 2000 + 4000 + 1000 + 2000
    }

    void truckPriceTest() {
        Vehicle vehicle = new Truck(new DieselEngine(),
                new AllDriveWheel(),
                new ClothInterior(),
                new TwoDoorsExterior());
        assert PriceCalculator.getPrice(vehicle).equals(55000d); //42000 + 2000 + 8000 + 1000 + 2000
    }

}

