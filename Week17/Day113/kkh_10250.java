import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int height = in.nextInt();
			int width = in.nextInt();
			int cnt = in.nextInt();
			
			int room = 101;
			int froom = 101;
			
			for(int j = 1; j < cnt; j++) {
				if(height == room / 100) {
					froom += 1;
					room = froom;
				} else {
					room += 100;			
				}
			}
			
			System.out.println(room);
		}
	}
}