import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i = 0; i < loop; i++) {	 
			for(int j = loop - i; j > 1 ; j--) {	
				System.out.printf(" ");
			}
			System.out.printf("*");			
			if(i != 0) {
				for(int k = 1; k < i * 2; k++) {
					System.out.printf(" ");
				}
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}