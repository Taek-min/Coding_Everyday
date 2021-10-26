import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int triangle[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(triangle);
			if(triangle[2] == 0) {
				break;
			}
			if(Math.pow(triangle[0],2) +Math.pow(triangle[1],2) == Math.pow(triangle[2],2)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
