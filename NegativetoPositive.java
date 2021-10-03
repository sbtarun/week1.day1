package week1.day1.assignments;

public class NegativetoPositive {

	public static void main(String[] args) {
		int num = -15;
		if (num < 0) {
			System.out.println("Number is negative");
			System.out.println("The number " + num + " is converted to " + (num * -1));
		} else {
			System.out.println("Given number " + num + " is already positive");
		}
	}

}
