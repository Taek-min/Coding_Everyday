import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int apartment[][] = new int[15][15];

		for (int i = 0; i < 15; i++){
			apartment[0][i] = i;
		}
		for (int i = 1; i < 15; i++){
			for (int k = 1; k < 15; k++){
				apartment[i][k] = apartment[i-1][k] + apartment[i][k-1];
			}
		}

		int testCase = sc.nextInt();
		int floor;
		int unit;

		for(int i = 0 ; i < testCase ; i++){
			floor = sc.nextInt();
			unit = sc.nextInt();
			System.out.println(apartment[floor][unit]);
		}
	}
}