package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindInter {

	public static void main(String[] args) {
		List<Integer>arr1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer>arr2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		int size = arr1.size();
		System.out.println("The size of arr1 is: "+size);
		int size2 = arr2.size();
		System.out.println("The size of arr2 is: "+size2);
		System.out.println("The intersection of two array is: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size2; j++) {
				if(arr1.get(i).equals(arr2.get(j))) {
					System.out.println(arr2.get(j));
				}
			}
		}
	}

}
