package ProgramsSDET;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElementsArrays {

	public static void main(String[] args) {

       int[] ar = {10,50,80,30,20};
       
       System.out.println("Before sorting --->"+Arrays.toString(ar));
       Arrays.parallelSort(ar);
       System.out.println("After sorting --->"+Arrays.toString(ar));
       
       
       
       Integer[] ar1 = {10,50,80,30,20};
       
       System.out.println("Before sorting --->"+Arrays.toString(ar1));
       Arrays.sort(ar1,Collections.reverseOrder());
       System.out.println("After sorting --->"+Arrays.toString(ar1));
		
	}

}
