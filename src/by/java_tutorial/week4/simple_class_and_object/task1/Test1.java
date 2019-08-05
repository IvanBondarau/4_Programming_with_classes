package by.java_tutorial.week4.simple_class_and_object.task1;

public class Test1 {
	
	private double x;
	private double y;
	
	public Test1() {
		this.x = 0d;
		this.y = 0d;
	}
	
	public Test1(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getMax() {
		return x > y ? x : y;
	}
	
	public double getSum() {
		return x + y;
	}
	
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}

}
