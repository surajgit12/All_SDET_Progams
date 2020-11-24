package ProgramsSDET;

import java.util.Arrays;

public class CheckEqualityOfArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4 };

		boolean status = Arrays.equals(a, b);

		System.out.println(status);

		if (status == true) {
			System.out.println("arrays are equals");
		}

		else {
			System.out.println("arrays are not equals");
		}
	}

}
