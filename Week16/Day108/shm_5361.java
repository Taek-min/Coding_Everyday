import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); 
		double [] price = {350.34, 230.90, 190.55, 125.30, 180.90}; 
		int testCast = scan.nextInt(); 
		int [] arr = new int [5]; 
		
		for(int i = 0; i < testCast; i++) { 
			double sum = 0;
			for(int j = 0; j < 5; j++) { 
				arr[j] = scan.nextInt(); 
				sum += arr[j] * price[j]; 
			} 
			System.out.println("$"+String.format("%.2f", sum)); 
		}
	}
}
