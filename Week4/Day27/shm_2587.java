package Day27;

import java.util.Scanner;
import java.util.Arrays;
////굿꾸우우웃꿌꿌꿌 : 22 :3 깔끔 :4
public class shm_2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			int num = sc.nextInt();
			array[i] += num;
			sum += num;
		}
		Arrays.sort(array);
		System.out.printf("%d\n%d", sum/array.length, array[array.length/2]);
	}

}
