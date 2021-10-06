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
		String alphabet = scan.nextLine();
		
		for(int j = 0; j < 3; j++) {
			if(alphabet.charAt(j) == 'A') {
				System.out.print(num[0]);
			}
			if(alphabet.charAt(j) == 'B') {
				System.out.print(num[1]);
			}
			if(alphabet.charAt(j) == 'C') {
				System.out.print(num[2]);
			}
			System.out.print(" ");
		}	
    }
}