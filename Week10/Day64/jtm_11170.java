import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < testcase; i++) {
			int nums[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int cnt = 0;
			for(int j = nums[0]; j <= nums[1]; j++) {
				if(Integer.toString(j).contains("0")) {
					for(int k = 0; k < Integer.toString(j).length(); k++) {
						if(Integer.toString(j).charAt(k) == '0') {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
