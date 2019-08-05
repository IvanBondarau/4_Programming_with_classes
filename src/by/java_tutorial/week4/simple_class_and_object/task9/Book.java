package by.java_tutorial.week4.simple_class_and_object.task9;

import java.util.Arrays;

public class Book {

    private static int idCounter = 0;

    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int yearOfPublishing;
    private int pages;
    private double cost;
    private String bindingType;

    public Book(String title, String[] authors, String publisher,
                int yearOfPublishing, int pages, double cost, String bindingType) {
        this.id = idCounter++;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", pages=" + pages +
                ", cost=" + cost +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
