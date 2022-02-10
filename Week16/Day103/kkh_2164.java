import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		Queue<Integer> quere = new LinkedList<Integer>();
		for(int i = 1; i <= N; i++) {
			quere.offer(i);
		}
		
		while(quere.size() != 1) {
			quere.poll();
			quere.offer(quere.poll());
		}
		
		System.out.println(quere.poll());
	}
}