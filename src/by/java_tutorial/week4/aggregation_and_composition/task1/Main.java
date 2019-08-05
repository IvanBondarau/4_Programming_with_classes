package by.java_tutorial.week4.aggregation_and_composition.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Text text = new Text(null, null);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add new sentence");
            System.out.println("2. Set title");
            System.out.println("3. Print text");
            System.out.println("4. Exit");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter new sentence:");
                    Sentence newSentence = new Sentence(in.nextLine());
                    text.add(newSentence);
                    break;
                case 2:
                    System.out.println("Enter new title:");
                    String newTitle = in.nextLine();
                    text.setTitle(newTitle);
                    break;
                case 3:
                    System.out.println(text.get());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Incorrect input! Try again");

            }
        }
    }
}
