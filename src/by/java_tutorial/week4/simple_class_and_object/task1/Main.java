package by.java_tutorial.week4.simple_class_and_object.task1;

public class Main {

	public static void main(String[] args) {
		
		Test1 test = new Test1();
		test.setX(5);
		test.setY(7);
		
		System.out.println(test);
		System.out.println("Max: " + test.getMax());
		System.out.println("Sum: " + test.getSum());
		
	}

}
