package by.java_tutorial.week4.simple_class_and_object.task7;

public class Point {
	
	private double x;
	private double y;
	
	public Point() {
		this.x = 0d;
		this.y = 0d;
	}
	
	public Point(double x, double y) {
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
	
	public double distanceTo(Point other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
				
	}
}
