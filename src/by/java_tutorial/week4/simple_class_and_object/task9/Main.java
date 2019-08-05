package by.java_tutorial.week4.simple_class_and_object.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfBooks = 3;
        BookArray books = new BookArray(numOfBooks);

        String[] book1Authors =  {"A. C. Doyle"};
        Book testBook1 = new Book("The Final Problem", book1Authors, "Strand Magazine",
                1893, 5000, 228, "Hardcover" );
        books.set(0, testBook1);

        String[] book2Authors = {"McEnroe"};
        Book testBook2 = new Book("The Book Eating Magician", book2Authors, "Japan",
                2017, 50, 1337, "Softcover" );
        books.set(1, testBook2);

        String[] book3Authors = {"Arkady Strugatsky", "Boris Strugatsky"};
        Book testBook3 = new Book("Roadside Picnic", book3Authors, "MacMillan Publishing Co",
                1977, 1000, 666, "Softcover");
        books.set(2, testBook3);

        System.out.println("Enter author's full name");
        String authorName = in.nextLine();
        for (int i = 0; i < books.length(); i++) {
            for (var author: books.get(i).getAuthors()) {
                if (author.equals(authorName)) {
                    System.out.println(books.get(i));
                }
            }
        }

        System.out.println("Enter publisher name");
        String publisherName = in.nextLine();
        for (int i = 0; i < books.length(); i++) {
            if (books.get(i).getPublisher().equals(publisherName)) {
                System.out.println(books.get(i));
            }

        }

        System.out.println("Enter the year");
        int year = in.nextInt();
        for (int i = 0; i < books.length(); i++) {
            if (books.get(i).getYearOfPublishing() >= year) {
                System.out.println(books.get(i));
            }

        }
    }
}
