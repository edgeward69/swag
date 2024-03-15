package chapter4;
import java.util.Scanner;


public class erm {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		String bleh = "teehee";
		System.out.println(bleh.charAt(5));
		
		String bleh2 = "hello guys i love java class :D";
		System.out.println(bleh.toUpperCase()  + " hi guys " + bleh2.toUpperCase());
		
		
		
		String s1 = input.nextLine();
		String s2 = input.next();
		String  s3 = s1 + s2;
		System.out.println(s3);
	}

}
