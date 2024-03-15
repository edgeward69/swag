

public class exercise08_04 {

	public static void main(String[] args) {

		int hours[][] = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}	
		};
		
		
		
		//column name
		System.out.println("            Su  M   T   W   Th  F   Sa" );;

		//print array
		for (int row = 0; row < hours.length; row++) {
			
			//row name
			System.out.print("Employee " + row + ": ");
				
				  for (int column = 0; column < hours[row].length; column++) {
				    
				    System.out.print(hours[row][column] + "   ");
				  }
				  
				  System.out.println();
				} 		
		
		System.out.println("\nTotal hours in decreasing order");
		
			//print employees and their hours

			for (int row = 0; row < hours.length; row++) {
				
				int total = 0;
				for (int column = 0; column < hours[0].length; column ++) {
					total += hours[row][column];
				
			}
				
				System.out.println("The hours that employee " + row + " worked: " + total);
		}	
		
	}
				
}