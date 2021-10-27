import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String findNum = sc.next();
		int cnt = 0;
		
		for(int i = 1; i <= Integer.parseInt(num); i++) {
			for(int j = 0; j < String.valueOf(i).length(); j++) {
				if(findNum.charAt(0) == String.valueOf(i).charAt(j)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}////아구잘해~~ :2 :3 : 4
