package chapter9;

public class Exercise09_02 {

	public static void main(String[] args) {

		Stock percentage = new Stock(34.45, 34.5);
			
		System.out.print(percentage);
		
		
		}
		
	}
			
		
class Stock{

			Stock(){
			}
			
			String symbol = ("ORCL");
            String name =  ("Oracle Corporation");                
            double previousClosingPrice = 1;
            double currentPrice = 1;
            
            public Stock (double pcp, double cp) {
            	double previousClosingPrice = pcp;
            	double currentPrice = cp;
            }
            
            public double getChangePercentage() {
            	return currentPrice - previousClosingPrice;
            }
            
}

	
	
