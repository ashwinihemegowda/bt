package com.torryharris.driver;

import com.torryharris.model.AirIndia;
import com.torryharris.model.Swift;
import com.torryharris.model.Titanic;
import com.torryharris.model.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Swift swift=new Swift();
        swift.move();
        swift.changeGear();
        Titanic titanic=new Titanic();
        titanic.floating();
        titanic.move();
        AirIndia air=new AirIndia();
        air.fly();
        air.move();
    }

}
