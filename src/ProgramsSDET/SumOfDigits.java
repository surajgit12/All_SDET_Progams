package ProgramsSDET;

public class SumOfDigits {

	public static void main(String[] args) {

		int num = 1234;
		int sum = 0;
		
		
		while(num> 0) {
			
			    sum= sum+ num%10;     // 0+4 =4  4+3 =7
			     num = num/10;    // 123   
		}
		
      System.out.println(sum);
	}
}