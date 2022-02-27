package Day115;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int room[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int count = 0;
		
		for(int i = 0; i < room[0]; i++) {
			String str[] = in.nextLine().split("");	
			for(int j = 0; j < str.length; j++) {
				if(str[j].equals("P")) {
					count++;
				}
			}
		}	
		if(count == nums[2] * nums[3]) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
}
