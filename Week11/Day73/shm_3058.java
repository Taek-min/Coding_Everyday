import java.util.Scanner;

//// 깔끔 :22 정석이네요
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int array[] = new int[7]; //// int array[]같이 C 스타일로 배열 선언하기보다는 int[] array처럼 선언하는게 국룰
		
		for (int i = 0; i < loop; i++) {
			int sum = 0;
			int min = 100;
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
