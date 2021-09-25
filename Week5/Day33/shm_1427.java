import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char[] numArray = num.toCharArray();
		String[] strArray = new String[numArray.length];
		for(int i = 0; i < numArray.length; i++) {
			strArray[i] = String.valueOf(numArray[i]);
		}
		Arrays.sort(strArray, Collections.reverseOrder());
		for(String i : strArray) {
			System.out.printf("%s", i);
		}
	}
}
////굳굳 :2:33