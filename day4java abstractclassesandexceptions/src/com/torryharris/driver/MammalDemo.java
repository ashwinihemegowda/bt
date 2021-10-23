package com.torryharris.driver;

import com.torryharris.model.*;

import javax.management.BadAttributeValueExpException;

public class MammalDemo {
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.eat();
        cow.feed();
        Tiger tiger=new Tiger();
        tiger.eat();
        tiger.feed();
        Bat bat=new Bat();
        bat.eat();
        bat.feed();
        bat.fly();

    }
}
