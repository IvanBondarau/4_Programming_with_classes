package by.java_tutorial.week4.aggregation_and_composition.task2;

import java.util.Random;

public class Wheel {
    Random rand;
    int resource ;
    boolean broken;

    Wheel() {
        this.rand = new Random();
        this.resource = 1000;
        this.broken = false;
    }

    public int getResource() {
        return resource;
    }

    public boolean isBroken() {
        return broken;
    }

    public void run() {

        this.resource -= rand.nextInt(5) + 1;
        if (resource < 0) {
            broken = true;
            resource = 0;
        }
    }




}
