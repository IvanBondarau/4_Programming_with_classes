package by.java_tutorial.week4.aggregation_and_composition.task3;

public class Country {


    private String name;
    private Region[] regions;
    private City capital;
    private double square;

    Country(String name, City capital, Region[] regions) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
        for (int i = 0; i < regions.length;i++) {
            square += regions[i].getSquare();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfRegions() {
        return regions.length;
    }

    public Region getRegion(int index) {
        if (index < 0 || index >= regions.length) {
            throw new IndexOutOfBoundsException();
        }
        return regions[index];
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public double getSquare() {
        return square;
    }

    public Region setRegion(int index, Region region) {
        if (index < 0 || index >= regions.length) {
            throw new IndexOutOfBoundsException();
        }
        Region res = regions[index];
        regions[index] = region;
        return res;
    }
}
