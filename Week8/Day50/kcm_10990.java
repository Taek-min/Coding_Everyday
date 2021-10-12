import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		int num1 = line;
		int num2 = line;
		Loop2:	////이거 잘쓰네 이거 뭐야 
		for(int i = line; i > 0; i--) {
			Loop1:
			for(int j = 1; j < line * 2; j++) {
				if(j == num1 || j == num2) {
					System.out.printf("*");
					if(j == num2) {
						num1--;
						num2++;
						System.out.println("");
						break Loop1;
					}
				}
				else {
					System.out.printf(" ");
				}
			}
		}
	}
}