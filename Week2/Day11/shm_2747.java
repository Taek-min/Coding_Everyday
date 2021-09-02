package Day11;

import java.util.Scanner;

public class shm_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sequence = sc.nextInt();
		int array[] = new int[sequence + 1];
		
		array[0] = 0;
		array[1] = 1;
		
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(array[sequence]);
	}
}
