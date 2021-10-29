import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int num = in.nextInt();
			String numStr = Integer.toString(num);
			String str = Integer.toString(num * num);
			str = str.substring(str.length() - numStr.length(), str.length());
			if(str.equals(numStr)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
	}
}
