package chapter3;
import java.util.Scanner;


public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate: ");
		double exchangeRate = input.nextDouble();
		
		System.out.print("Enter 0 to convert USD to RMB or 1 for vice versa: ");
		int convert = input.nextInt();
		
		System.out.print("Enter the amount of money: ");
		double money = input.nextDouble();
		
		double converted = money * exchangeRate;

		
		switch (convert) {
		case 0: System.out.println("$" + money + " is ¥" + converted);
			break;
		
		case 1: System.out.println("¥" + money + " is $" + converted);
			break;

			}
		
		}	
		
	}

