package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissElement {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		int n=8;
		int sum=0;
		Collections.sort(arr);
		int size = arr.size();
		System.out.println("The sorted array is: ");
		for (int i = 0; i < size; i++) {
			
			System.out.println(arr.get(i));
		}
		int total=(n*(n+1))/2;
		System.out.println("The size of the array is: "+size);
		for (int j = 0; j < size; j++) {
			sum=sum+arr.get(j);
		}
		int missElement = total-sum;
		System.out.println("The missed element is: "+missElement);
	}

}
