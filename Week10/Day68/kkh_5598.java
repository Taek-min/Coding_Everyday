import java.util.*;

public class Main {

 	public static void main(String[] args) { // 자바 뿌듯해~ : 잘풀어 잘풀어~
		Scanner in = new Scanner(System.in);
		
		char str[] = in.nextLine().toCharArray();
		
		for(int i = 0 ;i < str.length; i++) {
			if(str[i] < 'D') {
				System.out.print((char) (str[i] + 23));
			} else {
				System.out.print((char) (str[i] - 3));
			}
		}
	}
}
