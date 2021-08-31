package Day8;

import java.util.Scanner;

//// 깔끔 : 22
public class shm_3058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int loop = sc.nextInt();
		int array[] = new int[7];
		
		for (int i = 0; i < loop; i++) {
			int sum = 0;
			int min = 100; //// 최대값이 100인 점 응용 멋져요
			for (int j = 0; j < array.length; j++) {
				array[j] = sc.nextInt();
				if (array[j] % 2 == 0) {
					sum += array[j];
					if (min > array[j]) {
						min = array[j];
					}
				}
			}
			System.out.printf("%d %d\n", sum, min);
		}
	}
}
