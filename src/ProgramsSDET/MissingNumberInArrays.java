package ProgramsSDET;

public class MissingNumberInArrays {

	// arrays should not have any duplicate
	// arrays no need to be sorted order
	// values should be in range.

	// sum1 = 1+2+4+5 = 12
	// sum2 = 1+2+3+4+5 =15
	// totalsum = sum2-sum1

	public static void main(String[] args) 
	{

		int[] ar = {1,2,3,5,6,7,8,9};

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i <= ar.length - 1; i++)
		    {
			sum1 = sum1 + ar[i];
            }

		System.out.println(sum1);

	     for(int i=1 ; i<=9;i++) 
	     {
	    	
	     sum2= sum2+i;
	    	
	    }
	    System.out.println(sum2);
	    
	    System.out.println("Missing arrays are----> " +(sum2-sum1));
}
}