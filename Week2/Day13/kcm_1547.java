package Day13;

import java.util.Scanner;

public class kcm_1547 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cup[] = new int[4];
		cup[1] = 1;
		int change;
		int amount = in.nextInt();
		for(int i = 0 ; i < amount; i++) {
			int swiching1 = in.nextInt();
			int swiching2 = in.nextInt();
			change = cup[swiching2];
			cup[swiching2] = cup[swiching1];
			cup[swiching1] = change;
		}
		
		for(int j = 1; j < cup.length; j++) {
			if(cup[j] == 1) {
				System.out.println(j);
			}
		}
		
		
		
	}

}
