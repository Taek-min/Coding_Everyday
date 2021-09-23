import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String palindrome = sc.nextLine();
			//// accord는 무슨뜻이에요 찾아보니까 합의라고만 나오는데 : 일치하다란 뜻도 있을걸 : 네.. 일치하다.. 그래서 일치한 횟수..
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
