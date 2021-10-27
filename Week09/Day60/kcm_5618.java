import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numAmount = in.nextInt();
		int nums[] = new int[numAmount];
		Arrays.sort(nums);
		for(int i = 0; i < nums.length; i++) {
			nums[i] = in.nextInt();
		}
		
		for(int j = 1; j <=nums[0]; j++) {
			int count =0;
			for(int k = 0; k < nums.length; k++) {
				if(nums[k] % j == 0) {
					count++;
				}
			}
			if(count == nums.length) {
				System.out.println(j);
			}
		}
	}
}//// nice 
