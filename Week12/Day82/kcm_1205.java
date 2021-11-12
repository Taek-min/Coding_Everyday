import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int rank = 1;

		if(nums[0] == 0) {
			System.out.println(rank);
			return;
		}

		int scoreList[] = new int[nums[2]];
		int scores[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		for(int i = 0; i < (nums[0] >= nums[2] ? nums[2] : nums[0]); i++) {
			if(scores[i] > nums[1]) {
				rank++; 
				if(rank == scoreList.length +1) {
					rank = -1;
				}
			}
			else if (scores[i] == nums[1]) {
				if(i + 1 == scoreList.length) {
					rank = -1;
				}
				continue;
			}
			else {
				break;
			}
		}
		
		System.out.println(rank);
	}
}