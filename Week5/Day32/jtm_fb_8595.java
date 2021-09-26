import java.util.Scanner;

public class Main {
	////굿이에용~ : 22
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordLength = sc.nextInt();
		char[] word = sc.next().toCharArray();
		long sumHidden = 0, hiddenNumber = 0;
		
		for (int i = 0; i < wordLength; i++) {
			if (word[i] >= '0' && word[i] <= '9') {
				//// hiddenNumber 등으로 이름 충분히 지을 수 있었을듯합니다 :2
				hiddenNumber = hiddenNumber * 10 + word[i] - '0';
			} 
			else {
				sumHidden += hiddenNumber; 
				hiddenNumber = 0;
			}
		}
		sumHidden += hiddenNumber;
		System.out.println(sumHidden);
	}
}
