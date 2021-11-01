import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int sides[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(sides);
			
			if(sides[0] == 0) {
				break;
			}
			
			if(sides[0]*sides[0] + sides[1]*sides[1] == sides[2]*sides[2]) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
