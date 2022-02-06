import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num2 = num;
		for(int i = 0 ; i < num; i++ ,num2++) {
			for(int j = 1; j <= num2; j++) {
				if(num + i >= j && j  >= num - i ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	}
}
