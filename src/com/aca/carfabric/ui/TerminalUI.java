package com.aca.carfabric.ui;

import com.aca.carfabric.engine.models.CarType;
import com.aca.carfabric.engine.models.EngineType;
import com.aca.carfabric.engine.models.WheelType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminalUI extends UI {
    private Scanner sc;
    private Map<Integer, CarType> carTypes;
    private Map<Integer, EngineType> engineTypes;
    private Map<Integer, WheelType> wheelTypes;

    public TerminalUI() {
        initializeComponents();
    }

    public static void main(String[] args) {
        TerminalUI ui = new TerminalUI();
        ui.askForCarType();
        ui.askForEngineType();
        ui.askForWheelType();
    }

    private void initializeComponents() {
        initializeCarTypes();
        initializeEngineTypes();
        initializeWheelTypes();
    }

    private void initializeCarTypes() {
        carTypes = new HashMap<>();
        carTypes.put(1, CarType.CROSSOVER);
        carTypes.put(2, CarType.SEDAN_SPORTCAR);
        carTypes.put(3, CarType.SEDAN_BUISNESS);
        carTypes.put(4, CarType.SEDAN_ELECTRICAL);
        carTypes.put(5, CarType.HATCHBACK);
        carTypes.put(6, CarType.TRUCK);
        carTypes.put(7, CarType.TRACTOR);
        carTypes.put(8, CarType.MOTORCYCLE);
        carTypes = Collections.unmodifiableMap(carTypes);
    }

    private void initializeEngineTypes() {
        engineTypes = new HashMap<>();
        engineTypes.put(1, EngineType.ELECTRICAL);
        engineTypes.put(2, EngineType.DIESEL);
        engineTypes.put(3, EngineType.PETROL);
        engineTypes.put(4, EngineType.HYBRID);
        engineTypes = Collections.unmodifiableMap(engineTypes);
    }

    private void initializeWheelTypes() {
        wheelTypes = new HashMap<>();
        wheelTypes.put(1, WheelType.ALL_WHEEELS_DRIVE);
        wheelTypes.put(2, WheelType.FRONT_WHEELS_DRIVE);
        wheelTypes.put(3, WheelType.BACK_WHEELS_DRIVE);
        wheelTypes  =Collections.unmodifiableMap(wheelTypes);
    }

    void print(String message) {
        System.out.println(message);
    }

    @Override
    public void askForCarType() {
        System.out.println("Type your preferred car type number\n" +
                "Crossover:\t1\n" +
                "Sedan\n" +
                "\tSport car:\t2\n" +
                "\tBusiness:\t3\n" +
                "\tElectric:\t4\n" +
                "Hatchback:\t5\n" +
                "Truck:\t6\n" +
                "Tractor:\t7\n" +
                "Motorcycle:\t8\n");
    }

    @Override
    public void askForWheelType() {
        System.out.println("Type your preferred wheel type number\n" +
                "All wheels drive:\t1\n" +
                "Front wheels drive:\t2\n" +
                "Back wheels drive:\t3\n");
    }

    @Override
    public void askForEngineType() {
        System.out.println("Type your preferred engine type number\n" +
                "Electrical:\t1\n" +
                "Diesel:\t2\n" +
                "Petrol:\t3\n" +
                "Hybrid:\t4\n");
    }

    @Override
    public WheelType getWheelType() {
        Integer wheelType = sc.nextInt();
        while (!wheelTypes.containsKey(wheelType)) {
            print("Incorrect wheel type. Try again..");
            wheelType = sc.nextInt();
        }
        return wheelTypes.get(wheelType);
    }

    @Override
    public EngineType getEngineType() {
        Integer engineType = sc.nextInt();
        while (!engineTypes.containsKey(wheelTypes)) {
            print("Incorrect engine type. Try again..");
            engineType = sc.nextInt();
        }
        return engineTypes.get(engineType);
    }

    @Override
    public CarType getCarType() {
        Integer carType = sc.nextInt();
        while (!carTypes.containsKey(carType)) {
            print("Incorrect engine type. Try again..");
            carType = sc.nextInt();
        }
        return carTypes.get(carType);
    }
}
