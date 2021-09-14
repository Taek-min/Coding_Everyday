package Day22;

import java.util.Scanner;

public class shm_1924 { ////깔끔. :2 : 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dayOfTheDay[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int month = sc.nextInt();
		int day = sc.nextInt();
		int plus = 0;
		for(int i = 1; i <= 12; i++) {
			if(i == month) {
				System.out.println(dayOfTheDay[(day + plus) % 7]);
				break;
			}
			switch(i) {
				case 1, 3, 5, 7, 8, 10, 12:
					plus += (31 % 7);
					break;
				case 4, 6, 9, 11:
					plus += (30 % 7);
					break;
				case 2:
					plus += (28 % 7);
					break;
			}
		}
	}
}