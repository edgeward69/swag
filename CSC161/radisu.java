package chapter3;
import java.util.Scanner;


public class radisu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		if (radius > 0) {
			
			double area = radius * radius * Math.PI;
			System.out.println("The area is for radius " + radius + " is " + area);
			
			
		}
		else {
			
			System.out.println("Enter a radius greater than 0");
		
		}
	}
}
