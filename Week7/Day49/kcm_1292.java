import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();	////list 잘쓰시네 굳 
		int first = in.nextInt();
		int last = in.nextInt();
		int sum = 0;
		int count = 0;

		Loop1: ////이거 좀 멋있따?
		for(int i = 1; i <= 1000; i++) { ////왜 1000번이나 돌려 //// 그게 낭만이 아닐까?
			for(int j = 0; j < i; j++) {
				list.add(i);
				count++;
				if(count == last) {
					break Loop1;
				}
			}
		}

		for(int k = first-1; k < last; k++) {
			sum += list.get(k);
		}
		
		System.out.println(sum);
	}

}
