import java.util.Scanner;
import java.util.Arrays; 

public class Main {////스마트 창민 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] phoneNum1 = Arrays.stream(in.next().split("")).mapToInt(Integer::parseInt).toArray();
		int[] phoneNum2 = Arrays.stream(in.next().split("")).mapToInt(Integer::parseInt).toArray();
		int firseIndex = 0;
		int	secondIndex = 0;
		int [] compatibility = new int[phoneNum1.length + phoneNum1.length];
		for(int i = 0 ; i < (phoneNum2.length + phoneNum2.length); i++) {
			if(i % 2 == 0) {
				compatibility[i] = phoneNum1[firseIndex];
				firseIndex++;
			}
			else if(i % 2 == 1) {
				compatibility[i] = phoneNum2[secondIndex];
				secondIndex++;
			}
		}
		for(int k = 0; k<14; k++) {
			for(int j = 0; j < compatibility.length-1; j++) {
				compatibility[j] = (compatibility[j] + compatibility[j+1]) % 10;
				System.out.println("k : " + k + " j : " + j + " num[j] : " + compatibility[j]);
			}
		}
		System.out.print(compatibility[0]);
		System.out.print(compatibility[1]);	
	}
}
