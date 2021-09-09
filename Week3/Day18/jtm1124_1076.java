package algorithm;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		int multiVal[] = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		String input[] = new String[3];
		int[] resultDigit = new int[3];
		
		for (int i = 0; i < 3; i++) {
			input[i] = sc.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (input[i].equals(color[j])) {
					resultDigit[i]=j;
				}
			}
		}
		
		long resistance = resultDigit[0]*10 + resultDigit[1];
		System.out.println(resistance * multiVal[resultDigit[2]]);
	}
}
	

