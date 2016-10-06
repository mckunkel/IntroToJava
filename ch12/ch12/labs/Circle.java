package ch12.labs;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		this(0.0, 0.0, Color.VIOLET, 0.0);
	}

	public Circle(double radius) {
		this(0.0, 0.0, Color.GREEN, radius);
	}

	public Circle(double xCoordinate, double yCoordinate, Color color, double radius) {
		super(xCoordinate, yCoordinate, color);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return this.radius * Math.PI * Math.PI;
	}

	public String draw() {
		return "This circle is located at x: " + super.getxCoordinate() + " y: " + super.getyCoordinate() + " of color "
				+ super.getColor();
	}

}
