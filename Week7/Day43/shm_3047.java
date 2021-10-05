import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum[] = new int[3];
		for(int i = 0; i < inputNum.length; i++) {
			inputNum[i] = sc.nextInt();
		}
		Arrays.sort(inputNum);
		sc.nextLine();
		String abcStr = sc.nextLine();
		for(int i = 0; i < abcStr.length(); i++) {
			//// switch 없이 num[str.charAt(i) - 'A'] 출력해도 됨
			switch(abcStr.charAt(i)) {
			case 'A':
				System.out.printf("%d ", inputNum[0]);
				break;
			case 'B':
				System.out.printf("%d ", inputNum[1]);
				break;
			case 'C':
				System.out.printf("%d ", inputNum[2]);
				break;
			}
		}
	}
}
//// 굳굳
//// 짱짱 : 22:33
