import java.util.Scanner;
import java.util.Arrays;

//// 깔끔
public class Main {////뭐야 둘이 코드 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = Arrays.stream(in.next().split("")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(num);
		for(int i = num.length-1; i >=0; i--) {
			System.out.print(num[i]);
		}
	}
}
