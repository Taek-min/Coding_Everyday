package week04; //// 백준에 올려서 맞은 코드로 올려주세요. 패키지문 때문에 런타임에러 남

import java.util.Scanner;
public class Main {
	////깔꼼~ : 22 :3 :4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for(int j = input; i < j; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
