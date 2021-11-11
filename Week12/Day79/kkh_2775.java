import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int k = in.nextInt(); 
			int n = in.nextInt(); 
			int[][] apart = new int[k + 1][n]; 

			for(int j = 0; j < k + 1; j++) {
				apart[j][0] = 1;
				if(j == 0) {
					for(int z = 1; z < n; z++) {
						apart[j][z] = z + 1;
					}
				} else {
					for(int z = 1; z < n; z++) {
						apart[j][z] = apart[j][z - 1] + apart[j - 1][z];
					}
				}
			}
			System.out.println(apart[k][n - 1]);
		}
	}
}