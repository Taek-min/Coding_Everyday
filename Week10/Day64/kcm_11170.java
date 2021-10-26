import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcount = in.nextInt();
		for(int i = 0; i < testcount; i++) {
			int count = 0;
			int start = in.nextInt();
			int end = in.nextInt();
			for(int k = start; k <= end; k++) {
				String num[] = Integer.toString(k).split("");
				for(int s = 0; s < num.length; s++) {
					if(num[s].equals("0")) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
//갈곰
}
