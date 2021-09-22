import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String palindrome = sc.nextLine();
			if(palindrome.equals("0")) {
				break;
			}
			
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
