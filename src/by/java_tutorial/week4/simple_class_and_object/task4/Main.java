package by.java_tutorial.week4.simple_class_and_object.task4;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		var trains = new Train[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Train #" + (i + 1));
			System.out.println("Enter train num: ");
			String num = in.nextLine();
			System.out.println("Enter destination: ");
			String destination = in.nextLine();
			System.out.println("Enter departure time: ");
			LocalTime departure = LocalTime.parse(in.nextLine());
			
			trains[i] = new Train(num, destination, departure);
		}
		
		print(trains);
		
		System.out.println();
		System.out.println("Sorted by number: ");
		Arrays.sort(trains, new Train.TrainNumComparator());
		print(trains);
		
		System.out.println();
		System.out.println("Sorted by destination: ");
		Arrays.sort(trains, new Train.TrainDestinationComparator());
		print(trains);
		
		System.out.println("Enter train number: ");
		String num = in.nextLine();
		
		boolean isFound = false;
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getNumber().equals(num)) {
				System.out.println(trains[i]);
				isFound = true;
			}
		}
		
		if (!isFound) {
			System.out.println("No trains with this number");
		}

	}
	
	private static void print(Train[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
