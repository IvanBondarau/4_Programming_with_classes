package by.java_tutorial.week4.simple_class_and_object.task9;

import java.util.Arrays;
import java.util.Comparator;

public class BookArray {

    private int length;
    private Book[] data;

    public BookArray(int length) {
        if (length > 0) {
            data = new Book[length];
            this.length = length;
        } else {
            data = null;
            length = 0;
        }
    }


    public int length() {
        return this.length;
    }

    public Book get(int index)
            throws IndexOutOfBoundsException {

        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(String.format("Invalid index"));
        } else {
            return data[index];
        }
    }

    public Book set(int index, Book book)
            throws IndexOutOfBoundsException {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException(String.format("Invalid index"));
        } else {
            Book ans = data[index];
            data[index] = book;
            return ans;
        }
    }

    public void sort(Comparator<Book> comp) {
        Arrays.sort(data, comp);
    }
}
