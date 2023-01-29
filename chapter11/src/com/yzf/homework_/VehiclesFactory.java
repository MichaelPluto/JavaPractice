package com.yzf.homework_;

public class VehiclesFactory {
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
