import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		printAvg(arr);
		printCenterNum(arr);
	}
	
	static void printAvg(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
	}
	
	static void printCenterNum(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length/2]);
	}
}
