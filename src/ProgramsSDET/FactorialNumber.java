package ProgramsSDET;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;

		int fact = 1;

		 //for (int i = 1; i <= 5; i++) 
		for(int i = num ; i >= 1 ;i-- )
		{

			fact = fact * i;
		}

		System.out.println(fact);

	}
}
