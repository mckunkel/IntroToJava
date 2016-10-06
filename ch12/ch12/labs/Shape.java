package ch12.labs;

public abstract class Shape implements Drawable, Comparable<Shape> {

	// fields
	private double xCoordinate;
	private double yCoordinate;
	Color color;

	// constructors
	public Shape() {
		this(0.0, 0.0, Color.ORANGE);
	}

	public Shape(double xCoordinate, double yCoordinate) {
		this(xCoordinate, yCoordinate, Color.BLUE);
	}

	public Shape(double xCoordinate, double yCoordinate, Color color) {
		this.setxCoordinate(xCoordinate);
		this.setyCoordinate(yCoordinate);
		this.setColor(color);
	}

	@Override
	public int compareTo(Shape o) {
		int compareValue = 0;
		if (this.getArea() < o.getArea()) {
			compareValue = -1;
		} else if (this.getArea() > o.getArea()) {
			compareValue = 1;
		} else {
			compareValue = 0;
		}
		return compareValue;
	}

	// methods
	public abstract double getArea();

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
