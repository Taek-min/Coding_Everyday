package Day48;

import java.util.Scanner;

public class kcm_2335 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long first = in.nextInt();
		long last = in.nextInt();
		long firstSum = 0;
		long lastSum = 0;
		
		if(first > last) {
			long change = last;
			last = first;
			first = change;
		}
		
		firstSum = (first-1) * (first) / 2 ;
		lastSum = last * (last +1) / 2 ;
		
		System.out.println(lastSum - firstSum);

	}

}
