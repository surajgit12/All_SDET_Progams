package ProgramsSDET;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * // 1st approch + String concentrations operator
		 * 
		 * String str = "Suraj";
		 * 
		 * String rev = "";
		 * 
		 * int len = str.length(); // 5
		 * 
		 * for (int i = len - 1; i >= 0; i--) { // 4 3
		 * 
		 * rev = rev + str.charAt(i); // Ja
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 * 
		 * }
		 */

		// 2nd Approch is Character Arrays

		/*
		 * String str = "Suraj"; 
		 * 
		 *  String rev ="";
		 * 
		 * char[] ch =str.toCharArray();
		 * 
		 * int len= ch.length;
		 * 
		 * for(int i =len-1;i>=0;i--) {
		 * 
		 * rev= rev+ch[i];
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 */

		String str = "suraj";

		StringBuffer rev;

		StringBuffer sb = new StringBuffer(str);
		rev = sb.reverse();
		System.out.println(rev);

	}

}
