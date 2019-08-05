package by.java_tutorial.week4.aggregation_and_composition.task5;

import java.util.ArrayList;
import java.util.Comparator;

public class TourArray {

    private ArrayList<Tour> tours;

    public TourArray() {
        tours = new ArrayList<>();
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public TourArray(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public TourArray filter(TourTemplate template) {
        TourArray res = new TourArray();
        for (var tour: tours) {
            if (template.equals(tour)) {
                res.addTour(tour);
            }
        }
        return res;
    }

    public void sort(Comparator<Tour> comparator) {
        tours.sort(comparator);
    }


}
