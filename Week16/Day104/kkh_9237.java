import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Integer[] treeTime = new Integer[N];
		int time = 1;
		
		for(int i = 0; i < N; i++) {
			treeTime[i] = in.nextInt();
		}
		
		Arrays.sort(treeTime, Collections.reverseOrder());
		
		for(int i = 1; i <= N; i++) {
			if(time < i + treeTime[i - 1]) {
				time = i + treeTime[i - 1];
			}
		}
		
		System.out.println(time + 1);
	}
}
// 깰껌 