package ProgramsSDET;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// 1)Nature Number = 1
		// number divisible by 1 and itself

		int num = 3;
		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0)
					count++;
				}
			if(count==2) {
				System.out.println("Number is prime");
			}
			
			else {
				System.out.println("number is not a prime");
			}

		} else {

			System.out.println("Not a Prime Number");
		}

	}

}
