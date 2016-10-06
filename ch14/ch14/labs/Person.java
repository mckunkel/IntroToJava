package ch14.labs;

public class Person {
	private String name;
	private int age;

	public Person(String n, int a) throws InvalidDataException, BadAgeException {
		if (n == null || n.equals("")) {
			throw new InvalidDataException();
		}
		if (a < 0 || a > 120) {
			throw new BadAgeException();
		}
		this.name = n;
		this.age = a;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}