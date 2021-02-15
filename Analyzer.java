package Problem1;
import java.util.Scanner;

public class Analyzer {
	public static void main(String args[]) {
		//System.out.println("Enter number(Q to quit): ");
		Scanner in = new Scanner(System.in);
		Data values = new Data();
		
		while(true) {
			String symbol = in.next();
			if(symbol.equals("Q") || symbol.equals("q")) {
				System.out.println("Average is " + values.getAverage());
				System.out.println("Maximum is " + values.getMaximum());
				break;
			}
			else {
				int num = Integer.parseInt(symbol);
				values.addValue(num);
				values.getAverage();
				values.getMaximum();
				
			}
			
		
		
		}
		
		
	}
}
