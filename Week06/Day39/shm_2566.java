import java.util.Scanner; //줄바꿈 국룰이래 멍청이>_< : 멍청이??

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArray[][] = new int[9][9];
		int max = 0;
		int lineNum = 0;
		int columnNum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			for(int j = 0; j < numArray.length; j++) {
				numArray[i][j] += sc.nextInt();
				if(max < numArray[i][j]) {
					max = numArray[i][j];
					lineNum = i + 1;
					columnNum = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", lineNum, columnNum);
	}
}
//// 다들 비슷하게 풀었네 : 2
//// 깔끔:2