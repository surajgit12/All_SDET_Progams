package ProgramsSDET;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int a = 12345;

		// 1st logic

		Scanner s = new Scanner(System.in);

		System.out.println("enter the number");

		int num = s.nextInt(); // 1234

		int rev = 0;
		// % return reminder

		while (num > 0) {

			rev = rev * 10 + num % 10; // 0+1234%10 = 0+4 =4 4*10 +123%10 = 40+3 =43 43*10 + 12%10 = 430+2 =432 432*10
										// +1%10
			num = num / 10; // 1234 /10 = 123 123/10 =12 12/10 = 1 1/10 =0

			// "divide / is return it will eliminate last digit and return rest of digit i.e
			// 1234 and it eliminate 4 and return 123"

			// "divide % is return it will return last digit i.e. 1234%10 i.e return 4
		}

		System.out.println(rev);
	}

}
