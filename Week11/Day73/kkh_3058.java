import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		in.nextLine();
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int minNum = 100;
			for(int j = 0; j < 7; j++) {
				int num = in.nextInt();
				if(num % 2 == 0) {
					sum += num;
					if(minNum > num) {
						minNum = num;
					}
				}
			}
			
			System.out.println(sum + " " + minNum);
		}
	}
}