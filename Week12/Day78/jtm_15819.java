import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int location = sc.nextInt();
		String[] handles = new String[testCase];
		
		for(int i = 0; i < testCase; i++) {
			handles[i] = sc.next();
		}
		Arrays.sort(handles);
		System.out.println(handles[location - 1]);
	}
}