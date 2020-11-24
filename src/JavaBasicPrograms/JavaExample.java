package JavaBasicPrograms;

public class JavaExample {

    public static void main(String[] args) {
        String str = "suraj";
        String rev =reverseString(str);
        System.out.println(rev);
     
        
    }

	public static String reverseString(String str) {
		
		if(str.isEmpty())
		return str;
	    return reverseString(str.substring(1))+str.charAt(0);
		
	}

}
