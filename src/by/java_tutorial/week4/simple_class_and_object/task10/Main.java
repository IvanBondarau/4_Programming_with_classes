package by.java_tutorial.week4.simple_class_and_object.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOfAirlines = 3;
        AirlineArray airlines = new AirlineArray(numOfAirlines);

        Airline testAirline1 = new Airline("Vilnius", "660A", "Ty-154",
                "12:33", "Wednesday");
        airlines.set(0, testAirline1);

        Airline testAirline2 = new Airline("Rome", "983C", "Airbus A380",
                "19:44", "Thursday");
        airlines.set(1, testAirline2);

        Airline testAirline3 = new Airline("Rome", "823B", "Airbus A380",
                "04:33", "Thursday");
        airlines.set(2, testAirline3);



        System.out.print("Enter destination: ");
        String destination = in.nextLine();
        for (int i = 0; i < airlines.length(); i++) {
            if (airlines.get(i).getDestination().equals(destination)) {
                System.out.println(airlines.get(i));
            }
        }

        System.out.println("Enter day of the week: ");
        String weekday = in.nextLine();
        for (int i = 0; i < airlines.length(); i++) {
            if (airlines.get(i).getWeekday().equals(weekday)) {
                System.out.println(airlines.get(i));
            }

        }

        System.out.println("Enter departure time: ");
        String departure = in.nextLine();
        for (int i = 0; i < airlines.length(); i++) {
            if (airlines.get(i).getWeekday().equals(weekday) &&
                    airlines.get(i).getDepartureTime().compareTo(departure) >= 0) {
                System.out.println(airlines.get(i));
            }

        }
    }
}
