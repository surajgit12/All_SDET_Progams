package ProgramsSDET;

public class SumofArraysElement {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		int sum = 0;

	/*	for (int i = 0; i <= ar.length - 1; i++)

		{
			sum = sum + ar[i];
		}
		*/
		
		for(int value :ar) {  // ar is elements of arrays which is assigned to the values.
			
			sum = sum+value;
		}
		
		
		
		System.out.println(sum);

	}

}
