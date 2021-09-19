package week04;

import java.util.Scanner;
public class Main {

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
