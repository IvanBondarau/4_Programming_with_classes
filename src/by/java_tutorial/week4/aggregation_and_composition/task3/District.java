package by.java_tutorial.week4.aggregation_and_composition.task3;

public class District {
    private String name;

    private City centre;
    private double square;

    public District(String name, City centre, double square) {
        this.name = name;
        this.centre = centre;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCentre() {
        return centre;
    }

    public void setCentre(City centre) {
        this.centre = centre;
    }

    public double getSquare() {
        return square;
    }
}
