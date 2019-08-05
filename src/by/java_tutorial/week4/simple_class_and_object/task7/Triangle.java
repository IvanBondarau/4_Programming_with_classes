package by.java_tutorial.week4.simple_class_and_object.task7;

public class Triangle {
	
	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		this.point1 = new Point(x1, y1);
		this.point2 = new Point(x2, y2);
		this.point3 = new Point(x3, y3);
	}
	
	private Point point1;
	private Point point2;
	private Point point3;
	
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	
	public double getPerimeter() {
		return point1.distanceTo(point2) 
				+ point1.distanceTo(point3)
				+ point2.distanceTo(point3);
	}
	
	public double getSquare() {
		double x1 = point2.getX() - point1.getX();
		double y1 = point2.getY() - point1.getY();
		
		double x2 = point3.getX() - point1.getX();
		double y2 = point3.getY() - point1.getY();
		
		return (x1*y2 - y1*x2) * 0.5d;
	}
	
	public Point getCentroid() {
		double x = (point1.getX() + point2.getX() + point3.getX()) / 3d;
		double y = (point1.getY() + point2.getY() + point3.getY()) / 3d;
		
		return new Point(x, y);
	}
}
