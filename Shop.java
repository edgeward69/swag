package Finalproj;
import java.util.*;

class itemCategory{
	
	String name; //category of item
	String type1; //1 - 3 different item	
	String type2;
	String type3;
	
	itemCategory(String name, String type1, String type2, String type3){
		
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.type3 = type3;
		
	}
	
}

public class Shop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		itemCategory Chips = new itemCategory("Chips", "Hot", "Cheesy", "Exotic");
		itemCategory Candy = new itemCategory("Candy", "Sour", "Sweet", "Chocolate");
		itemCategory Soda = new itemCategory("Soda", "Coca Cola", "Pepsi", "Fanta");
		
		double priceChips[] = {0.99, 1.99, 2.99};
		double priceCandy[] = {2.99, 2.99, 0.99};
		double priceSoda[] = {0.99, 0.99, 0.99};
		
		System.out.println("Welcome to Epic Corner Store!");
		boolean keepShopping = true;
		String endSelect = "";
		int j = 0; // to read what was chosen from item prices array
		double total = 0; //to calculate total
		
		do {
					
			System.out.println("Type a number to open the menu...");
			System.out.printf("%n%s  %s  %s %n1      2      3%n", Chips.name, Candy.name, Soda.name);
			int menuSelect = input.nextInt();
	
			
			switch (menuSelect) {
			
			case 1:
				System.out.println("Choose an option using 1-3: ");
				System.out.printf("%s       %s    %s %n", Chips.type1, Chips.type2, Chips.type3);
				for(int i = 0; i < priceChips.length; i++) {
					System.out.print(priceChips[i] + "      ");
				}
				System.out.print("\n");
				j = input.nextInt(); 
				total += priceChips[j-1]; 
				break;
			
			case 2:
				System.out.println("Choose an option using 1-3: ");
				System.out.printf("%s      %s     %s %n", Candy.type1, Candy.type2, Candy.type3);
				for(int i = 0; i < priceCandy.length; i++) {
					System.out.print(priceCandy[i] + "      ");
				}
				System.out.print("\n");
				j = input.nextInt();
				total += priceCandy[j-1];
				break;
				
			case 3:
				System.out.println("Choose an option using 1-3: ");
				System.out.printf("%s   %s       %s %n", Soda.type1, Soda.type2, Soda.type3);
				for(int i = 0; i < priceSoda.length; i++) {
					System.out.print(priceSoda[i] + "        ");
				}
				System.out.print("\n");
				j = input.nextInt();
				total += priceSoda[j-1];
				break;
				
			}
			
			System.out.println( "\n----------------------------------");
			
			
			
			
			System.out.println("Would you like to keep shopping?");
			endSelect = input.next();		
			if (endSelect.equals("no") || endSelect.equals("No") ) {
				keepShopping = false;	
				break;	
			}

			
						
		}
		while (keepShopping = true);
		
		
		System.out.println("Are there any coupons you would like to apply?: ");
		String couponAsk = input.next();
		
		if(couponAsk.equals("yes") || couponAsk.equals("Yes")) {
			
			System.out.println("Enter the coupon: ");
			String coupon = input.next();
			if(coupon.equals("VETERAN") || coupon.equals("SWAG") || coupon.equals("SAVE5")) {
				total -= .05*total;
				
			}
			
		}
		
		System.out.print("Total: $" + String.format("%.2f", total));
		
	}

}