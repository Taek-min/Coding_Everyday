package algorithm;
import java.util.Scanner;

//// 깔끔~ : 5 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int whichNum = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				whichNum--;
			}
			
			if(whichNum == 0) {
				System.out.println(i);
				break;
			}
		}
		if(whichNum != 0) {
			System.out.println(0);
		}
	}
}
