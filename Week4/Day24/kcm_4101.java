package Day24;

import java.util.Scanner;

public class kcm_4101 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int firstNum = in.nextInt();
			int secondNum = in.nextInt();
			if(firstNum == 0 && secondNum ==0) {
				break;
			}
			if(firstNum > secondNum) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}				
		}
		
	}

}