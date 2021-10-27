import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 0;
		
		while(true) {
			first = sc.nextInt();
			second = sc.nextInt();
			
			if(first == 0 && second == 0) {
				break;
			}
			printIfLeftIsBigger(first, second);
		}
	}
	
	static void printIfLeftIsBigger(int first, int second) {
		if(first <= second) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}
