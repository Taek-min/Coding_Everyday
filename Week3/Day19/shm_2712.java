package Day19;

import java.util.Scanner;

public class shm_2712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			double testCase = sc.nextDouble();
			String measure = sc.nextLine();
			
			switch(measure) {
				case " kg":
					System.out.println(String.format("%.4f",testCase*2.2046) + " lb");
					break;
				case " g":
					System.out.println(String.format("%.4f", testCase*3.7854) + " l");
					break;
				case " lb":
					System.out.println(String.format("%.4f", testCase*0.4536) + " kg");
					break;
				case " l":
					System.out.println(String.format("%.4f", testCase*0.2642) + " g");
					break;
				default:
					break;
			}
		}
	}

}
