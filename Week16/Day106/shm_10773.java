import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int loop = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < loop; i++) { 
			int num = sc.nextInt();
			if(num == 0) {
				st.pop();
			}
			else {
				st.push(num);
			}
		}
		while(!st.empty()) {
			sum += st.peek();
			st.pop();
		}
		System.out.println(sum);
	}
}