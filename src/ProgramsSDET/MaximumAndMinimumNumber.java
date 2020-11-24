package ProgramsSDET;

public class MaximumAndMinimumNumber {

	public static void main(String[] args) {

		int[] ar = { 10, 5, 6, 17, 11, 1 };

		int max = ar[0];

		for (int i = 1; i <= ar.length-1; i++) {

			if (max < ar[i]) {  // 10<5

				max = ar[i];

			}

		}
		System.out.println(max);

	}

}
