package Day9;

import java.util.Scanner;

//// 깔끔 : 2222222222222:3333
public class shm_22864 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fatigueDegreeUp = sc.nextInt();
		int work = sc.nextInt();
		int fatigueDegreeDown = sc.nextInt();
		int deadLine = sc.nextInt();
		int fatigueDegree = 0;
		int total = 0;
		
		for (int i = 0; i < 24; i++) {
			if (fatigueDegreeUp > deadLine) {
				break;
			}
			else if (fatigueDegree + fatigueDegreeUp > deadLine) {
				fatigueDegree -= fatigueDegreeDown;
			}
			else {
				fatigueDegree += fatigueDegreeUp;
				total += work;
			}
		}
		System.out.println(total);
	}
}
