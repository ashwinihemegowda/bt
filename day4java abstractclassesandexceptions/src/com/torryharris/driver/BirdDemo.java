package com.torryharris.driver;

import com.torryharris.model.Animal;
import com.torryharris.model.Bird;
import com.torryharris.model.Peacock;
import com.torryharris.model.Pigeon;

public class BirdDemo {
    public static void main(String[] args) {
        Bird peacock=new Peacock();
        peacock.eat();
        peacock.fly();
        Pigeon pigeon=new Pigeon();
        pigeon.eat();
        pigeon.fly();

    }
}
