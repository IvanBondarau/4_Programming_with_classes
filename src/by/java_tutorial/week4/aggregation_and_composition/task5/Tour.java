package by.java_tutorial.week4.aggregation_and_composition.task5;

public class Tour {

    private int duration;
    private String type;
    private String transport;
    private String nutrition;
    private double cost;

    public Tour() {
        this.duration = -1;
        this.type = null;
        this.transport = null;
        this.nutrition = null;
        this.cost = Double.NEGATIVE_INFINITY;
    }

    public Tour(int duration, String type, String transport, String nutrition, double cost) {
        this.duration = duration;
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}

