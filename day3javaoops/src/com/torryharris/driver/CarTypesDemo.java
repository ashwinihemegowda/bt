package com.torryharris.driver;

import com.torryharris.model.*;

public class CarTypesDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("mrf", 23.4f);
        MusicSystem sony = new MusicSystem("sony", 3, false, 35.6f);
        HatchBack swift = new HatchBack("petrol", 200, 200.8f, 6,
                "swift", mrf, sony, "manual");
        swift.displayHatchBackFeatures();
        System.out.println();
        Sedon dzire=new Sedon("diesel",200,
                80.6f,7,"dzire",mrf,sony,100);
        Tyre apollo=new Tyre("apollo",58.77f);
        MusicSystem harman=new MusicSystem("Harman",3,true,42.4f);
        dzire.setMus(harman);
        dzire.setTyre(apollo);
        dzire.displaySedon();
        System.out.println();
        Suv eco=new Suv("petrol",500,200.56f,7,"ECO",mrf,sony,"auto",false);
        eco.displaySuv();
    }
}
