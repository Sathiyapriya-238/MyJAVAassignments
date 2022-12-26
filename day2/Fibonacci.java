package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		int num=8,firstNum=0,secNum=1,num3;
		System.out.print(firstNum+" "+secNum); 
		for(int i=2;i<num;i++) {
			num3=firstNum+secNum;
			System.out.print(" "+num3);
		firstNum=secNum;
		secNum=num3;
		}
		
	}

}
