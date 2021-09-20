package Day28;

import java.util.Scanner;
	//// 이문제 넷다 똑같이 풀었네,,, 깔꼼~~ :2 : 33
public class shm_2440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			for(int j = loop - i; j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
