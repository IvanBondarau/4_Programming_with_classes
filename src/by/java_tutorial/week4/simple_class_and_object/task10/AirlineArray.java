package by.java_tutorial.week4.simple_class_and_object.task10;

import java.util.Arrays;
import java.util.Comparator;

public class AirlineArray {

    private int length;
    private Airline[] data;

    public AirlineArray(int length) {
        if (length > 0) {
            data = new Airline[length];
            this.length = length;
        } else {
            data = null;
            length = 0;
        }
    }


    public int length() {
        return this.length;
    }

    public Airline get(int index)
            throws IndexOutOfBoundsException {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(String.format("Invalid index"));
        } else {
            return data[index];
        }
    }

    public Airline set(int index, Airline Airline)
            throws IndexOutOfBoundsException {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(String.format("Invalid index"));
        } else {
            Airline ans = data[index];
            data[index] = Airline;
            return ans;
        }
    }

    public void sort(Comparator<Airline> comp) {
        Arrays.sort(data, comp);
    }
}
