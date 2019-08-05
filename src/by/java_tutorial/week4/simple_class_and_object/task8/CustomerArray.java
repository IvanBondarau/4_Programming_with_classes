package by.java_tutorial.week4.simple_class_and_object.task8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CustomerArray {

    private int length;
    private Customer[] data;

    public CustomerArray(int length) {
        if (length > 0) {
            data = new Customer[length];
            this.length = length;
        } else {
            data = null;
            length = 0;
        }
    }


    public int length() {
        return this.length;
    }

    public Customer get(int index)
        throws IndexOutOfBoundsException {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(String.format("Invalid index"));
        } else {
            return data[index];
        }
    }

    public Customer set(int index, Customer customer)
        throws IndexOutOfBoundsException {
            if (index < 0 || index >= length) {
                throw new IndexOutOfBoundsException(String.format("Invalid index"));
            } else {
                Customer ans = data[index];
                data[index] = customer;
                return ans;
            }
    }

    public void sort(Comparator<Customer> comp) {
        Arrays.sort(data, comp);
    }
}
