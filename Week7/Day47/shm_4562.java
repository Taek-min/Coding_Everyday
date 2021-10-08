import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int brain = sc.nextInt();
			int numOfNecessaryBrain = sc.nextInt();
			
			if(brain >= numOfNecessaryBrain) {
				System.out.println("MMM BRAINS");
			}
			else {
				System.out.println("NO BRAINS");
			}
		}
	}
}
