package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		List<Integer> ar=new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		int size = ar.size();
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(ar.get(i).equals(ar.get(j))) {
					System.out.println("The Duplicates in the array is: "+ar.get(j));
				}
			}
			
		}
				
	}
	
}
