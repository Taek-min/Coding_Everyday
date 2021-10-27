package Day23;

import java.util.Scanner;

public class shm_4619 {  ////good :2 :3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double findNum = 0;
		
		while(true) {
			double num = sc.nextInt();
			double exponent = sc.nextInt();
			
			if(num == 0 && exponent == 0) {
				break;
			}
			findNum = Math.pow(num, 1/exponent);
			int max = (int)Math.pow(Math.ceil(findNum), exponent);
			int min = (int)Math.pow(Math.floor(findNum), exponent);
			
			boolean closerMax = max - num < num - min;
			if(closerMax) {
				System.out.println((int)Math.ceil(findNum));
			}
			else {
				System.out.println((int)Math.floor(findNum));
			}
		}
	}
}
