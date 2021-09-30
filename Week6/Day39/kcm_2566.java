import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][]nums = new int[9][9];
		int max = 0;
		int vertical = 0;
		int horizontal = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = in.nextInt();
				if(nums[i][j] > max) {
					max = nums[i][j];
					vertical = i+1;
					horizontal = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(vertical + " " + horizontal);
	}
}