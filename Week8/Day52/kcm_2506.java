import java.util.Scanner;

public class Main {
	public static void main(String[] args) {////굿굿 일 고생했다잉
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		int ox[] = new int[amount];
		int count = 0;
		int sum = 0;

		for(int i = 0; i < ox.length; i++) {
			ox[i] = in.nextInt();
		}
		
		for(int j = 0; j < ox.length; j++) {
			sum += ox[j];
			if(ox[j] == 1) {
				count++;
				if(count > 1) {
					sum += (count-1);
				}
			}
			else {
				count = 0;
			}
		}
		System.out.println(sum);
	}
}
