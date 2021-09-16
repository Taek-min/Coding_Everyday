package Day24;

import java.util.Scanner;

//// 깔끔
public class shm_4101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			if (num1 > num2) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
