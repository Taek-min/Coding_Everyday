import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int [3];
		for(int i=0;i<3;i++){
		    num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		scan.nextLine();
		String Alphabet = scan.nextLine(); ////변수 앞에는 소문자. :2 소문자. : 3:ㅋㅋㅋㅋ기옵네
		
		for(int j = 0; j < 3; j++) {
			if(Alphabet.charAt(j) == 'A') {
				System.out.print(num[0]);
			}
			if(Alphabet.charAt(j) == 'B') {
				System.out.print(num[1]);
			}
			if(Alphabet.charAt(j) == 'C') {
				System.out.print(num[2]);
			}
			System.out.print(" ");
		}	
    }
}
