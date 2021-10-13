import java.util.Scanner;

<<<<<<< Updated upstream
public class Main { //완쾌하세요 : 빠른 쾌유를 빕니다.
=======
<<<<<<< HEAD
<<<<<<< HEAD
public class Main { //완쾌하세요:22아프디망😢
=======
public class Main { //완쾌하세요 : 빠른 쾌유를 빕니다.
>>>>>>> 7bce88e14ff36f1de87e596c78e6d9f60b5e30f7
=======
public class Main { //완쾌하세요 : 빠른 쾌유를 빕니다.
>>>>>>> 7bce88e14ff36f1de87e596c78e6d9f60b5e30f7
>>>>>>> Stashed changes
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[4];
		int y[] = new int[4];
		
		for(int i = 0; i < x.length - 1; i++) {
			x[i] += sc.nextInt();
			y[i] += sc.nextInt();
		}
		
		for(int i = 1; i < y.length - 1; i++) {
			if (x[0] == x[i]) {
				if(i % 2 == 0) {
					x[3] = x[1];
				}
				else {
					x[3] = x[2];
				}
				break;
			}
			else {
				x[3] = x[0];
			}
		}
		
		for(int i = 1; i < y.length - 1; i++) {
			if (y[0] == y[i]) {
				if(i % 2 == 0) {
					y[3] = y[1];
				}
				else {
					y[3] = y[2];
				}
				break;
			}
			else {
				y[3] = y[0];
			}
		}
		System.out.printf("%d %d", x[3], y[3]);
	}
}
