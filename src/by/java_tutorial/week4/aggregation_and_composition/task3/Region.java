package by.java_tutorial.week4.aggregation_and_composition.task3;

import java.util.ArrayList;

public class Region {

    private String name;
    private District[] districts;
    private City centre;
    private double square;

    Region(String name, City centre, District[] districts) {
        this.name = name;
        this.centre = centre;
        this.districts = districts;
        for (int i = 0; i < districts.length; i++) {
            square += districts[i].getSquare();
        }
    }


    public double getSquare() {
        return square;
    }

    public City getCentre() {
        return centre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfDistricts() {
        return districts.length;
    }

    public District getDistrict(int index) {
        if (index < 0 || index >= districts.length) {
            throw new IndexOutOfBoundsException();
        }
        return districts[index];
    }

    public District setDistrict(int index, District district) {
        if (index < 0 || index >= districts.length) {
            throw new IndexOutOfBoundsException();
        }
        District res = districts[index];
        districts[index] = district;
        return res;
    }
}
