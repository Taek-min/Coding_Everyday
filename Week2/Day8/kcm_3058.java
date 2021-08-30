package Day8;

import java.util.Scanner;

public class kcm_3058 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int num[] = new int[7];
		int nowCount = 1;
		for(int j = 1; j <= count; j++) {
			int min = 0;
			int sum = 0;
			for(int i=0; i < num.length; i++) {
				num[i] = in.nextInt();
				if(num[i] % 2 == 0) {
					if(min == 0) {
						min = num[i];
					}
					if(min > num[i]) {
						min = num[i];
					}		
					sum += num[i];
				}
			}
			System.out.println(sum + " " + min);
		}

	}

}
