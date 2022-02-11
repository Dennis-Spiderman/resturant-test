package exceptions;

public class NegativeNumberException extends RuntimeException{

	public NegativeNumberException(double weight) {
		super("That weight is negative. Please try with a positive number"
				+ weight + ".");
	}
}
