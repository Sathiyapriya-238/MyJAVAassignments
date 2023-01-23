package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate1 {

	public static void main(String[] args) {
		String text1="We learn java basics as part of java sessions in java week1";
		Set<String> ot=new LinkedHashSet<String>();
		String[] split = text1.split(" ");
	
		for (int i = 0; i < split.length; i++) {
			if(!ot.add(split[i])) {
				ot.remove(split[i]);
			}
		}
		System.out.println(ot);
	}

}
