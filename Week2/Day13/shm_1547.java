package Day13;

import java.util.Scanner;

public class shm_1547 { //// 굳굳
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int swap = 0;
		int cup[] = new int [3];
		cup[0] = 1;
		cup[1] = -1;
		cup[2] = -1;
		
		for (int i = 0; i < loop; i++) {
			int first = sc.nextInt();
			int last = sc.nextInt();
			swap = cup[first - 1];
			cup[first - 1] = cup[last - 1];
			cup[last - 1] = swap;
		}
		
		for (int i = 0; i < cup.length; i++) {
			if(cup[i] == 1) {
				System.out.println(i + 1);
			}
		}
	}
}
