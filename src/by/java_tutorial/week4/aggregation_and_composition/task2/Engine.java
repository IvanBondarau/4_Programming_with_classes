package by.java_tutorial.week4.aggregation_and_composition.task2;

public class Engine {

    private String model;
    private int power;

    Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}
