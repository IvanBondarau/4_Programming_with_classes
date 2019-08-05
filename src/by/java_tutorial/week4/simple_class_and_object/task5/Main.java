package by.java_tutorial.week4.simple_class_and_object.task5;

public class Main {

	public static void main(String[] args) {
		
		Counter test = new Counter(-3, 5);
		
		test.setRandom();
		
		System.out.println(test.get());
		
		for (int i = 0; i < 10; i++) {
			test.dec();
			System.out.println(test.get());
		}
		
		for (int i = 0; i < 10; i++) {
			test.inc();
			System.out.println(test.get());
		}
	}

}
