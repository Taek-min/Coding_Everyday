import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// bool배열을 사용하면 되지 않았을까? : 너도 함 풀어봐라 :예~~ 다 푸러~
		int numOfStudent[] = new int[31];
		
		for(int i = 1; i < 29; i++) {
			int num = sc.nextInt();
			numOfStudent[num] = 1;
		}
		
		for(int i = 1; i < numOfStudent.length; i++) {
			if(numOfStudent[i] != 1)
				System.out.println(i);
		}
	}
}
//// 굳