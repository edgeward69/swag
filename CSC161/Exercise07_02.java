import java.util.Scanner;

public class Exercise07_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		int numbers[] = new int[10];
				
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print("Read a number: ");
			numbers[i] = input.nextInt();		
				
			
		}
	
		System.out.print("The reversal of the input is ");
		
		for (int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
			
		}
		
	}

}
