import java.util.*;

//// 깔끔 :22 정석이네요 :3 : 4
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		//// 요기는 줄바꿈 안해도 됐을 것 같아요
		in.nextLine();
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			int minNum = 100;
			for(int j = 0; j < 7; j++) {
				int num = in.nextInt();
				if(num % 2 == 0) {
					sum += num;
					if(minNum > num) {
						minNum = num;
					}
				}
			}
			
			System.out.println(sum + " " + minNum);
		}
	}
}
