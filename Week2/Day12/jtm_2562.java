package algorithm;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { ////깔꼼:2
		Scanner sc = new Scanner(System.in);
		//// 들여쓰기는 안 깔끔
		 int[] arr = new int[9];
		 for(int i = 0; i < arr.length; i++) {
			 arr[i] = sc.nextInt();
		 }
		 maxCounting(arr);
	}

	//// 함수 첫 단어는 동사로. printMaxCount 식으로
	static void maxCounting(int[] arr) {
		int max = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				cnt = i;
			}
		}
		System.out.println(max);
		System.out.println(cnt + 1);
	}
}
