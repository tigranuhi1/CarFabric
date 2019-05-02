package com.aca.carfabric.ui;

import com.aca.carfabric.engine.models.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminalUI extends UI {
    private Scanner sc;
    private Map<Integer, CarType> carTypes;
    private Map<Integer, EngineType> engineTypes;
    private Map<Integer, WheelType> wheelTypes;
    private Map<Integer, InteriorType> interiorTypes;
    private Map<Integer, ExteriorType> exteriorTypes;

    public TerminalUI() {
        sc = new Scanner(System.in);
        initializeComponents();
    }

    private void initializeComponents() {
        initializeCarTypes();
        initializeEngineTypes();
        initializeWheelTypes();
        initializeInteriorTypes();
        initializeExteriorTypes();
    }

    private void initializeExteriorTypes() {
        exteriorTypes = new HashMap<>();
        exteriorTypes.put(1, ExteriorType.TWO_DOORS);
        exteriorTypes.put(2, ExteriorType.THREE_DOORS);
        exteriorTypes.put(3, ExteriorType.FOUR_DOORS);
        exteriorTypes.put(4, ExteriorType.FIVE_DOORS);
    }

    private void initializeInteriorTypes() {
        interiorTypes = new HashMap<>();
        interiorTypes.put(1, InteriorType.LEATHER_SALON);
        interiorTypes.put(2, InteriorType.CLOTH_SALON);
    }

    private void initializeCarTypes() {
        carTypes = new HashMap<>();
        carTypes.put(1, CarType.CROSSOVER_SPORT);
        carTypes.put(2, CarType.CROSSOVER_BUSINESS);
        carTypes.put(3, CarType.CROSSOVER_ECONOM);
        carTypes.put(4, CarType.SEDAN_SPORT);
        carTypes.put(5, CarType.SEDAN_BUSINESS);
        carTypes.put(6, CarType.SEDAN_ECONOM);
        carTypes.put(7, CarType.HATCHBACK_SPORT);
        carTypes.put(8, CarType.HATCHBACK_BUSINESS);
        carTypes.put(9, CarType.HATCHBACK_ECONOM);
        carTypes.put(10, CarType.TRUCK);
        carTypes.put(11, CarType.TRACTOR);
        carTypes.put(12, CarType.MOTORCYCLE);
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

    private void print(String message) {
        System.out.println(message);
    }

    @Override
    public void askForCarType() {
        print("Type your preferred car type number\n" +
                "Crossover:\n" +
                "\tSport car:\t1\n" +
                "\tBusiness:\t2\n" +
                "\tElectric:\t3\n" +
                "Sedan\n" +
                "\tSport car:\t4\n" +
                "\tBusiness:\t5\n" +
                "\tElectric:\t6\n" +
                "Hatchback\n" +
                "\tSport car:\t7\n" +
                "\tBusiness:\t8\n" +
                "\tElectric:\t9\n" +
                "Truck:\t\t\t10\n" +
                "Tractor:\t\t11\n" +
                "Motorcycle:\t\t12");
    }

    @Override
    public void askForWheelType() {
        System.out.println("Type your preferred wheel type number\n" +
                "All wheels drive:\t1\n" +
                "Front wheels drive:\t2\n" +
                "Back wheels drive:\t3");
    }

    @Override
    public void askForEngineType() {
        System.out.println("Type your preferred engine type number\n" +
                "Electrical:\t1\n" +
                "Diesel:\t2\n" +
                "Petrol:\t3\n" +
                "Hybrid:\t4");
    }

    @Override
    public void askForInteriorType() {
        System.out.println("Type you preferred interior type number\n" +
                "Leather salon:\t1\n" +
                "Cloth salon:\t2" );
    }

    @Override
    public void askForExteriorType() {
        System.out.println("Type you preferred exterior type number\n" +
                "2 doors:\t1\n" +
                "3 doors:\t2\n" +
                "4 doors:\t3\n" +
                "5 doors:\t4");
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
    public InteriorType getInteriorType() {
        Integer interiorType = sc.nextInt();
        while (!interiorTypes.containsKey(interiorType)) {
            print("Incorrect interior type. Try again..");
            interiorType = sc.nextInt();
        }
        return interiorTypes.get(interiorType);
    }

    @Override
    public ExteriorType getExteriorType() {
        Integer exteriorType = sc.nextInt();
        while (!exteriorTypes.containsKey(exteriorType)) {
            print("Incorrect exterior type. Try again..");
            exteriorType = sc.nextInt();
        }
        return exteriorTypes.get(exteriorType);
    }

    @Override
    public EngineType getEngineType() {
        Integer engineType = sc.nextInt();
        while (!engineTypes.containsKey(engineType)) {
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
