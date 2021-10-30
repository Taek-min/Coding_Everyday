import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nums[] = in.nextLine().split(" ");		
		long sum = 0;
		
		for(int i = 0; i < nums[0].length(); i++) {
			for(int j = 0; j < nums[1].length(); j++) {
				sum += (nums[0].charAt(i) - '0') * (nums[1].charAt(j) - '0');
			}
		}
		System.out.println(sum);
	}
}
