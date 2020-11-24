package ProgramsSDET;

import java.util.Scanner;

public class ReverseStringBF {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();

	/*	 1st approch StringBuffer rev;

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println(rev);
*/
		
		// 2nd approch Using StringBuilder class
		
		StringBuilder rev;
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		   rev =sb.reverse();
		
		System.out.println("reverese num--->"+rev);
	}

}
