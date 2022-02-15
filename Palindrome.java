package week1day4;


public class Palindrome {
public static void main(String[] args) {
	   
	String input="malayalam";
	String rev="";
	
	for (int i = input.length()-1; i >=0; i--) {
		rev=rev+input.charAt(i);
		System.out.println(rev);
	}
	if(input.equals(rev)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("Given String is not Palindrome");
	}
}
}
