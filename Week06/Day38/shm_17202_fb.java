import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstPhoneNum = sc.nextLine();
		String secondPhoneNum = sc.nextLine();
		String mixedNum = "";
		
		for(int i = 0; i < firstPhoneNum.length(); i++) {
			mixNum += firstPhoneNum.charAt(i);
			mixNum += secondPhoneNum.charAt(i);
		}
		
		for(int i = 0; i < mixNum.length() - 1; i++) {
			for(int j = 0; j < mixNum.length() - i - 1; j++) {
				int sum[] = new int[mixNum.length() - 1 - i];
				sum[j]  += Character.getNumericValue(mixNum.charAt(j)) + Character.getNumericValue(mixNum.charAt(j + 1));
				
				if(sum[j] >= 10) {
					sum[j] %= 10;
				}
				
				System.out.println(sum[j]);
				
				if(sum.length == 2) {
					System.out.printf("%d%d", sum[0], sum[1]);
					break;
				}
			}
		}
	}
}
