import java.util.Scanner;
import java.util.Arrays;

public class Main {////이게 바로 시골코딩?: 22 :어쩐지 소똥향기 나드라~굿굿

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number[] = new int[5];
		int avg = 0;
		int sum = 0;
		for(int i =0; i < number.length; i ++) {
			number[i] = in.nextInt();
			sum += number[i];
		}
		Arrays.sort(number);
		avg = sum / number.length;
		System.out.println(avg);
		System.out.println(number[number.length/2]);	
	}
}
