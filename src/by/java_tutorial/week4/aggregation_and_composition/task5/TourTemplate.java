package by.java_tutorial.week4.aggregation_and_composition.task5;

public class TourTemplate {


    private int duration;
    private String type;
    private String transport;
    private String nutrition;
    private double cost;

    public TourTemplate() {
        this.duration = -1;
        this.type = null;
        this.transport = null;
        this.nutrition = null;
        this.cost = Double.NaN;
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

    public boolean equals(Tour tour) {
        return (this.getDuration() == -1 || (this.getDuration() == tour.getDuration()))
                && (this.getType() == null || (this.getType().equals(tour.getType())))
                && (this.getTransport() == null || (this.getTransport().equals(tour.getTransport())))
                && (this.getNutrition() == null || (this.getNutrition().equals(tour.getNutrition())))
                && (this.getCost() == Double.NaN || (this.getCost() >= tour.getCost()));

    }
}
