package week3.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String value="Madam";
		String revValue="";
		for (int i =value.length()-1; i>=0; i--) {
			revValue = revValue + value.charAt(i);
		}
		if(revValue.equalsIgnoreCase(value)) {
			System.out.println("The String "+value+" is Palindrome");
		}
		else {
			System.out.println("The String "+value+" is not a Palindrome");
		}
	}

}
