package by.java_tutorial.week4.simple_class_and_object.task6;

public class Main {

	public static void main(String[] args) {
		
		TimeMoment test = new TimeMoment("13:27:44");
		System.out.println(test);
		
		test.addSeconds(1100);
		System.out.println(test);
		
		test.addMinutes(5000);
		System.out.println(test);
		
		test.setMinutes(110);
		System.out.println(test);

	}

}
