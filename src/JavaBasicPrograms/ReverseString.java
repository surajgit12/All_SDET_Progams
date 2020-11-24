package JavaBasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		// Using StringBuffer class
		StringBuffer  st = new StringBuffer("suraj");
		System.out.println(st.reverse());
		
		
		// Using iterative method
		
		String str = "SELENIUM" ;
        char[] arr= str.toCharArray();
        
       for(int i =arr.length-1; i>=0; i--) {
        
        System.out.print(arr[i]);
        }
		//
	}

}
