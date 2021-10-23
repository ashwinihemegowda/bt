package com.torryharris.driver;

import com.torryharris.model.Car;
import com.torryharris.model.MusicSystem;
import com.torryharris.model.Tyre;

public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf=new Tyre("MRF",50.1f);
        MusicSystem sony=new MusicSystem("Sony",2,false,22.4f);
        Car neon=new Car("petrol",1500,93.4f,6,"neon",mrf,sony);
        neon.setTyre(mrf);
        neon.setMus(sony);
        neon.accelerate();
        neon.changeGear(2);
        neon.steer();
        neon.applyBrake();
        System.out.println();
        neon.displayFeatures();
        Tyre appollo=new Tyre("Apollo",11.54f);
        neon.setTyre(appollo);
        neon.displayFeatures();
        MusicSystem harman=new MusicSystem("Harman",2,true,20.5f);
        neon.setMus(harman);
        neon.displayFeatures();
    }
}
