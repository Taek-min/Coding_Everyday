package Day18;

import java.util.Scanner;

public class shm_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resistanceTable[] = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String Color[] = new String[3];
		String sum = "";
		long total = 0;
		
		for(int i = 0; i < Color.length; i++) {
			Color[i] = sc.nextLine();
			for(int j = 0; j < resistanceTable.length; j++) {
				if(resistanceTable[j].equals(Color[i])) {
					if(i == 0) {
						sum += j;
					}
					else if(i == 1) {
						sum += j;
					}
					else {
						total = Integer.parseInt(sum) * (long)Math.pow(10, j);
						System.out.println(total);
					}
				}
			}
		}
	}
}
