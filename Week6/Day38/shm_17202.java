import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstPhoneNum = sc.nextLine();
		String secondPhoneNum = sc.nextLine();
		String mixNum = "";
		int result = 0;
		for(int i = 0; i < firstPhoneNum.length(); i++) {
			mixNum += firstPhoneNum.charAt(i) - '0';
			mixNum += secondPhoneNum.charAt(i) - '0';
		}
		while(mixNum.length() != 2) {
			String combine = "";
			for(int i = 0; i < mixNum.length() - 1; i++) {
				combine += (mixNum.charAt(i) + mixNum.charAt(i + 1) - '0' * 2) % 10;
			}
			mixNum = combine;
		}
		System.out.println(mixNum);
	}
}
