package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer> input=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(input);
		int size=input.size();
		System.out.println("The size of the array is: "+size);
		
		for (int j = size-1; j >=0; j--) {
		
			System.out.println(input.get(j));
		
		if(input.get(j)!=input.get(size-1)) {
			System.out.println("The Second Largest element is: "+input.get(j));
				break;
		}
			}
	}
}
