package Day11;

import java.util.Scanner;
//// 깔끔 :33
public class shm_2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sequence = sc.nextInt();
		//// 배열 없이도 구현할 수 있지 않아요?? : 22
		int array[] = new int[sequence + 1]; //// 출력할 숫자만큼 만 배열 생성하는 방법 굿. :22
		
		array[0] = 0;
		array[1] = 1;
		
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(array[sequence]);
	}
}
