package chapter5;
import java.util.Scanner;


public class Exercise06_07 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("The amount invested: ");
		double invested = input.nextDouble();
		System.out.println("Annual interest rate: ");
		double intRate = input.nextDouble();
		
		double monthlyIntRate = intRate/1200;
		
		System.out.println("Years        Invested Value");

		for (int years = 1; years <= 30; years++) {
			
			System.out.printf("%-19d%6.2f\n", years, futureInvest(invested, monthlyIntRate,years));
		
			}
		
	}	

public static double futureInvest(double invested, double monthlyIntRate, int years) {
	
		return invested * Math.pow(1 + monthlyIntRate, years * 12);
	
	}
}
	
	
	



