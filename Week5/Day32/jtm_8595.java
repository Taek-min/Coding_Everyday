import java.util.Scanner;

public class Main {
	////굿이에용~ : 22
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordLength = sc.nextInt();
		char[] word = sc.next().toCharArray();
		long sumHidden = 0, tmp = 0;
		
		for (int i = 0; i < wordLength; i++) {
			if (word[i] >= '0' && word[i] <= '9') {
				tmp = tmp * 10 + word[i] - '0';
			} 
			else {
				sumHidden += tmp; //temporary
	                tmp = 0;
			}
		}
		sumHidden += tmp;
		System.out.println(sumHidden);
	}
}
