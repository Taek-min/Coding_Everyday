package Month2;

import java.util.Scanner;
public class shm_1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int refusalCnt = 0;
		int seat[] = new int[loop];
		for(int i = 0; i < loop; i++) {
			seat[i] = sc.nextInt();
			for(int j = 0; j < seat.length; j++) {
				if(i == j) {
					continue;
				}
				else if(seat[i] == seat[j]) {
					refusalCnt++;
					break;
				}
			}
		}
		System.out.println(refusalCnt);
	}
}
