package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter11
 */

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passBoat() {
        //Boat boat = VehiclesFactory.getBoat();
        //boat.work();
        //if (vehicles == null) {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

    }
    public void common() {
        //if (vehicles == null) {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void useAircraft() {
        if (!(vehicles instanceof Aircraft)) {
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }
}
