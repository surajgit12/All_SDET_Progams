package ProgramsSDET;

public class Separate_Two_String_with_Space {

	public static void main(String[] args) {

		/*
		 * int num =12345;
		 * 
		 * int rev = 0;
		 * 
		 * while (num>0) {
		 * 
		 * 
		 * rev = rev*10 +num%10; num = num/10; } System.out.println(rev); }
		 */

		String s = "Suraj";

		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}
}
