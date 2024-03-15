package chapter3;
import java.util.Scanner;


public class chapter3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Please enter a number greater than 10: ");
		int number = input.nextInt(); 
		
		if (number > 10) {
			
			System.out.println("Your number, " + number  + ", is greater than 10");
			
		}
		else System.out.println("Your number, " + number  + ", is less than 10");
		
	}

}
