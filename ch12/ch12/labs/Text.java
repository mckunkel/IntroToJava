package ch12.labs;

public class Text implements Drawable {

	private String value;

	public Text(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Value is " + value;
	}

}
