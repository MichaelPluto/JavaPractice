package com.yzf.homework_;

public class Person {
    private String name;
    private Vehicles vehicles;//返回接口

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        if (!(vehicles instanceof Boat)){
            //先得到船
            vehicles = VehiclesFactory.getBoat();
        }
            vehicles.work();
    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            //先得到马
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void especial(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
