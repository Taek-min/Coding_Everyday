package Day12;

import java.util.Scanner;

//// 깔끔 :22 :b 3 
public class shm_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[9];
		int max = 0;
		int order = 0;
		
		for (int i = 0;i < array.length; i++) {
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
				order = i + 1;
			}
		}
		System.out.printf("%d\n%d", max, order);
	}

}
