package Day28; //// 백준에 올려서 맞은 코드로 올려주세요. 패키지문 때문에 런타임에러 남

import java.util.Scanner;
	//// 이문제 넷다 똑같이 풀었네,,, 깔꼼~~ :2 : 33 :4
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
