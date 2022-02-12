import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			
			if(r < e - c) {
				System.out.println("advertise");
			}
			else if(r == e - c) {
				System.out.println("does not matter");
			}
			else {
				System.out.println("do not advertise");
			}
		}
	}
}
