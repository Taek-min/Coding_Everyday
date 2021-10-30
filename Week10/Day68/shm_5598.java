import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 다들 비슷하게 풀으셧네요
		Scanner sc = new Scanner(System.in);
		
		String beforeWord = sc.nextLine();
		String[] sentence = beforeWord.split("");
		for(int i = 0; i < sentence.length; i++) {
			if(sentence[i].charAt(0) >= 68) {
				System.out.printf("%c", (char)(sentence[i].charAt(0) - 3));
			}
			else if(sentence[i].charAt(0) >= 65 && sentence[i].charAt(0) <= 67) {
				System.out.printf("%c", (char)(sentence[i].charAt(0) + 23));
			}
		}
	}
}