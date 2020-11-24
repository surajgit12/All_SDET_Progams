package ProgramsSDET;

public class PrintEvenAndOddArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5,55,24 };

		for (int value : a)
		{

			if (value % 2 == 0) 
			{

				System.out.println("Even values--->" + value);
			}

			else 
			{
				System.out.println("Odd values--->" + value);
			}

		}

	}

}
