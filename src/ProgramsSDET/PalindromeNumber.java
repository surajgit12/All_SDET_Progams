package ProgramsSDET;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = s.nextInt();

		int rev = 0;
		int org_num = num;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		if (org_num == rev) {

			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

}
