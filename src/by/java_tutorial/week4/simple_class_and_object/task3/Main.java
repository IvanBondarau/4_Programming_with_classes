package by.java_tutorial.week4.simple_class_and_object.task3;

public class Main {

	public static void main(String[] args) {
		
		Student[] studentsList = new Student[5];
		
		int[] marks1 = {9, 8, 10, 7, 9};
		studentsList[0] = new Student("Gorbunkov P. S.", "653501", marks1);
		
		int[] marks2 = {6, 8, 10, 5, 8};
		studentsList[1] = new Student("Milukow T. R.", "750503", marks2);
		
		int[] marks3 = {10, 10, 10, 10, 10};
		studentsList[2] = new Student("Volodkov S. E.", "053501", marks3);
		
		int[] marks4 = {5, 6, 8, 5, 7};
		studentsList[3] = new Student("Artemeko P. A.", "653501", marks4);
		
		int[] marks5 = {10, 9, 10, 9, 9};
		studentsList[4] = new Student("Bondarchuk V. S.", "853501", marks5);
		
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].isStraightAStudent()) {
				System.out.println(studentsList[i]);
			}
		}

	}

}
