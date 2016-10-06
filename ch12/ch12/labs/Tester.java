package ch12.labs;

public class Tester {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10.0, 10.0);
		shapes[1] = new Rectangle(1., 2., Color.VIOLET, 12, 13);
		shapes[2] = new Circle(12., 11, Color.YELLOW, 12);

		for (Shape shape : shapes) {
			System.out.println("The area is : " + shape.getArea());
			System.out.println(shape.draw());
		}

		Drawable[] draws = new Drawable[3];
		draws[0] = new Rectangle(12.0, 12.0);
		draws[1] = new Rectangle(2., 2., Color.VIOLET, 12, 12);
		draws[2] = new Circle(1., 1, Color.YELLOW, 5);
		for (Drawable drawable : draws) {
			System.out.println(drawable.draw());

		}

		Drawable[] drawables = new Drawable[3];
		drawables[0] = new Text("Pooop");
		drawables[1] = new Rectangle(2., 2., Color.VIOLET, 12, 12);
		drawables[2] = new Circle(1., 1, Color.YELLOW, 5);
		for (Drawable d : drawables) {
			System.out.println(d.draw());

		}

		Rectangle rectangle = new Rectangle(3, 60);
		Circle circle = new Circle(5);

		int result = rectangle.compareTo(circle);

		if (result > 0) {
			System.out.println("Greater than");
		} else if (result < 0) {
			System.out.println("Less than");
		} else {
			System.out.println("Equal");
		}

	}

}
