import java.util.Scanner;

//// (x%5+1)이 사실 1234512345인걸 깨달았다면 더 간단하게 풀었을듯요
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 1; i <= loop; i++) {
			int cheatCnt = 0;
			for(int j = 1; j <= 10; j++) {
				int problem = sc.nextInt();
				if(problem % 5 == j % 5) {
					cheatCnt++;
					if(cheatCnt == 10) {
						System.out.println(i);
					}
				}
			}
		}
	}
}