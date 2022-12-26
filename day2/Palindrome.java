package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int n = 34343,temp=0,remainder;
		int t=n;
		for (; n !=0; n=n/10) {
			remainder=n%10;
			temp=(temp*10)+remainder;
		}
		if(t==temp) {
			System.out.println("The number "+t+" is Palindrome number");
		}
		else {
			System.out.println("The number "+t+" is not a Palindrome number");
		}
	}

}
