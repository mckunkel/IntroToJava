package ch12.labs;

public class Rectangle extends Shape {

	private double height;
	private double width;

	public Rectangle() {
		this(0.0, 0.0, Color.VIOLET, 0.0, 0.0);
	}

	public Rectangle(double height, double width) {
		this(0.0, 0.0, Color.GREEN, height, width);
	}

	public Rectangle(double xCoordinate, double yCoordinate, Color color, double height, double width) {
		super(xCoordinate, yCoordinate, color);
		this.setHeight(height);
		this.setWidth(width);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

	public String draw() {
		return "This rectangle is located at x: " + super.getxCoordinate() + " y: " + super.getyCoordinate()
				+ " of color " + super.getColor();
	}

}
