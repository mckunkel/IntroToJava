package ch14.labs;

public class BadAgeException extends Exception {

	@Override
	public String getMessage() {
		return " Age is not valid. ";
	}

}
