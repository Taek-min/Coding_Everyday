package Day12;

import java.util.Scanner;

//// 깔끔 :22 :b 3 
public class shm_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 배열 안쓰고 구현 할 수 있지 않을까요~? 제가 죄송합니다. 적극 반영하겠습니다~
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
