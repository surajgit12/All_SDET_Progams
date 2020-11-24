package JavaBasicPrograms;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {

		/*
		 * System.out.println("Enter the string");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String s=sc.nextLine();
		 * 
		 * String[] words = s.trim().split(" ");
		 * 
		 * System.out.println("Number of words in the string = "+words.length);
		 */

		String s = "QA Automation engineer group 44";

		
		  String[] words = s.trim().split(" ");
		  
		  System.out.println("Number of words in the string = " + words.length);
		 

	
		int count = 1;

		for(int i =0; i<s.length()-1;i++) {
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
			{
				count++;
			
			}
		}

		System.out.println("Number of words in a string = " + count);
	}

}
