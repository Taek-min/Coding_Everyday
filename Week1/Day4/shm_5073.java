package Day4;

import java.util.Scanner;

public class shm_5073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int side[] = new int[3];
		
		while(true) {
			int sum = 0;
			for (int i = 0; i < side.length; i++) {
				int input = sc.nextInt();
				side[i] = input;
				sum += input;
			}
			
			//// 한줄이라도 중괄호 { } 넣어주는게 좋음
			if (sum == 0) //// sum == 0 까리하네 :22
				break;
			
			if (side[0] >= side[1] + side[2] || side[1] >= side[0] + side[2] || side[2] >= side[0] + side[1])
				System.out.println("Invalid");
			else if (side[0] == side[1] && side[1] == side[2])
				System.out.println("Equilateral");
			else if (side[0] == side[1] || side[1] == side[2] || side[0] == side[2])
				System.out.println("Isosceles");
			else if (side[0] != side[1] && side[1] != side[2])
				System.out.println("Scalene");
		}
	}
}
//// 굿굿 :22 깔끔하다 :33아유잘해~~~