import java.util.*;
//// 다 똑같이 풀었네
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int handleNum = sc.nextInt();
		int order = sc.nextInt();
		sc.nextLine();
		String[] Id = new String[handleNum];
		
		for(int i = 0; i < handleNum; i++) {
			Id[i] = sc.nextLine();
		}
		Arrays.sort(Id);
		System.out.println(Id[order - 1]);
	}
}