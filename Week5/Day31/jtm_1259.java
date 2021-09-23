import java.util.Scanner;

//// 깔끔 : 22
public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String palindrome = sc.nextLine();
			if(palindrome.equals("0")) {
				break;
			}
			
			//// 새로운 기능 찾아본 거 칭찬해 : 22 
			StringBuffer sb= new StringBuffer(palindrome);
			String reversedPalindrome = sb.reverse().toString();
		
			if(palindrome.equals(reversedPalindrome)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
