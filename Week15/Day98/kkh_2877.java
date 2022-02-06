import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int K = in.nextInt();		
		String K2 = Integer.toBinaryString(K + 1); // 배워가요
		
		for(int i = 1; i < K2.length(); i++) {
			if(K2.substring(i, i + 1).equals("0")) {
				System.out.print("4");
			} else {
				System.out.print("7");
			}
		}
	}
}
// 천잰가,,