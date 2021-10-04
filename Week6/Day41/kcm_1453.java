import java.util.Scanner;

//// 정석 구현 멋있어요 : 22
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean seat[] = new boolean[101]; ////boolean 배열은 첨봐 신기 :int보다 효율적이야 
		int visits = in.nextInt();
		int count = 0;
		for(int i = 0; i < visits; i++) {
			int human = in.nextInt();
			if(seat[human]) {
				count++;
			}
			else {
				seat[human] = true;
			}
		}
		System.out.println(count);
	}
}
