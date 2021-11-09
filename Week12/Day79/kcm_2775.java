import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();

		for(int i = 0; i < testCase; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			int house[][] = new int[k +1][n];
			
			for(int j = 0; j < house[0].length; j++) {
				house[0][j] = j + 1;
			}
			
			for(int s = 1; s < house.length; s++) {
				for(int g = 0; g < house[s].length; g++) {
					if(g == 0) {
						house[s][g] = 1;
					}
					else {
						house[s][g] = house[s][g-1] + house[s-1][g];
					}
				}
			}

			System.out.println(house[k][n-1]);
		}	
	}
}
