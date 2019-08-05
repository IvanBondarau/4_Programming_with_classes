package by.java_tutorial.week4.simple_class_and_object.task3;

import java.util.Arrays;

public class Student {
	
	public Student(String fullName, String groupNum, int[] marks) {
		super();
		this.fullName = fullName;
		this.groupNum = groupNum;
		this.marks = marks;
	}

	private String fullName;
	private String groupNum;
	private int[] marks;
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getGroupNum() {
		return groupNum;
	}
	
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public boolean isStraightAStudent() {
		for (int i = 0; i < this.marks.length; i++) {
			if (marks[i] < 9) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", groupNum=" + groupNum + ", marks=" + Arrays.toString(marks) + "]";
	}
}
