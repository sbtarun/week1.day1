package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, input = 13;
		boolean flag = false;
		for (i = 2; i <= input / 2; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(input + " is a prime number");
		} else {
			System.out.println(input + " is not a prime number");
		}
	}
}
