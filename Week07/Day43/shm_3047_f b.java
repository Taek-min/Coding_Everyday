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
			System.out.printf("%d ", inputNum[abcStr.charAt(i) - 'A']); 
		}
	}
}
