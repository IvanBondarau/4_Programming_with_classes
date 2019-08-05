package by.java_tutorial.week4.simple_class_and_object.task4;

import java.time.LocalTime;
import java.util.Comparator;

public class Train {
	
	public Train(String number, String destination, LocalTime departure) {
		super();
		this.number = number;
		this.destination = destination;
		this.departure = departure;
	}
	
	private String number;
	private String destination;
	private LocalTime departure;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public LocalTime getDeparture() {
		return departure;
	}
	
	public void setDeparture(LocalTime departure) {
		this.departure = departure;
	}
	
	public static class TrainNumComparator implements Comparator<Train> {
		@Override
		public int compare(Train a, Train b) {
			return a.getNumber().compareTo(b.getNumber());
		}
	}
	
	public static class TrainDestinationComparator implements Comparator<Train> {
		@Override
		public int compare(Train a, Train b) {
			int compareDestinations = a.getDestination().compareTo(b.getDestination());
			
			if (compareDestinations == 0) {
				return a.getDeparture().compareTo(b.getDeparture());
			} else {
				return compareDestinations;
			}
		}
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", destination=" + destination + ", departure=" + departure + "]";
	}
	
}
