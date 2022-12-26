package week1.day2;

import java.util.Arrays;

public class ArrayElements {

	public static void main(String[] args) {
		int[] array1= {23,45,67,32,89,22};
		Arrays.sort(array1);
		for (int i = 0; i <array1.length; i++) {
			System.out.print(" "+array1[i]);
		}
		System.out.println(" The second smallest element in the array is " +array1[1]);
	}


}