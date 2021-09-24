import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordLength = sc.nextInt();
		long sum = 0;
		String word = sc.next();
		String saveNumber = "";
		
		for(int i = 0; i < wordLength; i++) {
			boolean findNum = word.charAt(i) >= '0' && word.charAt(i) <= '9';
			if(findNum) {
				saveNumber += word.charAt(i);
			}
			else {
				////이 코드가 두번 들어가지 않게 하는 방법이 있지 않을까? :22
				if(saveNumber.length() > 0) {
					sum += Long.parseLong(saveNumber);
					saveNumber = "";
					}
				}
			} //// 탭정리 웨이레
		if(saveNumber.length() > 0) {
			sum += Long.parseLong(saveNumber);
			saveNumber = "";
			}
		System.out.println(sum);
	}
}