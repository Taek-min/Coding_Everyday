import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		int sum = 0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i = 0; i < k; i++) {
			num.add(in.nextInt());

			if(num.get(num.size() - 1) == 0) {
				num.remove(num.size() - 1);
				num.remove(num.size() - 1);
			}
		}
		
		for (int i = 0; i < num.size(); ++i) {
			sum += num.get(i);
        }
        System.out.print(sum);
	}
}