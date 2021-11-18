import java.util.Scanner;
//헿 for 안에 for 두개쓰는게 싫었어 난 ,, 고생했네~~
public class Main { 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int star = in.nextInt();

		for(int i = 1; i <= star * 2 -1; i++) {
			if(i <= star) {
				for(int j = 1; j <= star; j++) {
					if(j <= star -i) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			else {
				for(int j = 1; j <= star; j++) {
					if(j <= i - star) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}		
	}
}
