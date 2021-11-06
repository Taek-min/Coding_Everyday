import java.util.*;

public class Main {
	public static void main(String[] args) { ////굳 굳 굳 b
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int amountOfSubject = sc.nextInt();
			int[] scores = new int[amountOfSubject];
			int max = 0;
			for(int j = 0; j < scores.length; j++) {
				scores[j] = sc.nextInt();
			}
			Arrays.sort(scores);
			
			for(int k = 1; k < scores.length; k++) {
				if(max < scores[k] - scores[k - 1]) {
					max = scores[k] - scores[k - 1];
				}
			}
			System.out.printf("Class %d\n", i + 1);
			System.out.printf("Max %d, Min %d, Largest gap %d\n", scores[amountOfSubject - 1], scores[0], max);
		}		
	}
}
