import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String palindrome = sc.nextLine();
			int accordCnt = 0;
			if(palindrome.equals("0")) {
				break;
			}
			
			for(int i = 0; i < palindrome.length()/2; i++) {
				boolean accordNum = palindrome.charAt(i) == palindrome.charAt(palindrome.length()-1-i);
				if(accordNum){
					accordCnt++;
				}
			}
			
			if(accordCnt == palindrome.length()/2) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}