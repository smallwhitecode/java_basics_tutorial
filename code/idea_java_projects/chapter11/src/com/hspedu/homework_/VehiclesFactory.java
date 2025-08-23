package com.hspedu.homework_;

/**
 * @Author:李强
 * @Date:2025/3/23
 * @Description:chapter11
 */

public class VehiclesFactory {
    //马儿始终是同一匹
    private static Horse horse = new Horse();
    private VehiclesFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Aircraft getAirplane() {
        return new Aircraft();
    }

}
