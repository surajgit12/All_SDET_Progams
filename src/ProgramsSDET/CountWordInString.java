package ProgramsSDET;

import java.util.Scanner;

public class CountWordInString {

	public static void main(String[] args) {
		
		
	//	System.out.println("Enter the string");
		 
		/*  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the string");
			
		  String s=sc.nextLine();*/
		  
		  String s = "Suraj Umbarkar ff ff 22";
		 
		 String[] words = s.trim().split(" ");
		 
		System.out.println("Number of words in the string = "+words.length);
		  
		 /* int count =1;
		  
		  for(int i=0; i<= s.length()-1;i++) {
			  
			  
			  if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
				  
				  count++;
				  
			  }
			
		  }
		
		System.out.println(count);*/
		
		
		
		
	}

}
