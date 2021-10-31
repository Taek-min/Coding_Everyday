import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {// 님 혹 관? //ㅋㅋ
		Scanner in = new Scanner(System.in);
		String str[] = {"A", "B", "C", "D", "E", "F", "G" ,"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y", "Z"};
		String caesarStr[] = {"D", "E","F", "G" ,"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y", "Z", "A", "B", "C"};
		
		String testStr[] = in.nextLine().split("");
		for(int i = 0; i < testStr.length; i++) {
			testStr[i] = str[Arrays.asList(caesarStr).indexOf(testStr[i])];
			System.out.print(testStr[i]);
		}
	}

}
