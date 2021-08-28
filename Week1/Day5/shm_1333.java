package Day5;
		
import java.util.Scanner;		
								   
public class shm_1333 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int D = sc.nextInt();
		int cmp = 0;
		//// 공식 활용을 잘 한거 같아요
		for (int i = 0; i < N; i++) { 
			for (int t = (i*(L+5)+L); t < (i+1)*(L+5); t++) {
				if(t % D == 0) {	// 간주와 알람 일치 시 
					cmp = t;
					break;
				}
			}
			if(cmp != 0)
				break;
		}
		if (cmp == 0) //앨범이 끝나고도 못들음
			System.out.println(N * (L + 5) - 5 + D - (N * (L + 5) - 5) % D);
		else
			System.out.println(cmp);
		}
}
