package Month2;

import java.util.*;

public class shm_2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < loop; i++) {
			String numArray = sc.nextLine();
			String[] numSplit = numArray.split(" ");
			int[] num = Arrays.stream(numSplit).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(num);
			System.out.println(num[7]);
		}
	}
}
