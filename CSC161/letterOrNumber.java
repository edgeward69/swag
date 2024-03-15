package chapter4;
import java.util.Scanner;

// ask for input and then it should tell you whether its uppercase, lowercase or a number
public class letterOrNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter or a number: ");
		char ch = input.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			
			System.out.println("It is an uppercase letter");
		}
		else if (ch >= 'a' && ch <= 'z') {
			
			System.out.println("It is an lowercase letter");
			
		}
		else if (ch >= '0' && ch <= '9') {
			
			System.out.println("It is a number");
			
		}
		
	}

}