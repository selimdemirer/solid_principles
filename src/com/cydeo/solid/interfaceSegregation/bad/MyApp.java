package com.cydeo.solid.interfaceSegregation.bad;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        birds.add(new Chicken());

        letBirdsFly(birds);

    }

    public static void letBirdsFly(List<Bird> birds) {
        for (Bird each : birds) {
            each.fly();     // Does nothing for chicken
        }
    }

}