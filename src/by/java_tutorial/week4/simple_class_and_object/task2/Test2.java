package by.java_tutorial.week4.simple_class_and_object.task2;

public class Test2 {
	
	private double x;
	private double y;
	
	public Test2() {
		this.x = 0d;
		this.y = 0d;
	}
	
	public Test2(double x, double y) {
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
	
	public String toString() {
		return "Test2 [x=" + x + ", y=" + y + "]";
	}

}
