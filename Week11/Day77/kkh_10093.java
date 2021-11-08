import java.util.*;

public class Main {
	public static void main(String[] args) { //// 음청 잘해 ~ 
		Scanner in = new Scanner(System.in);

		long num[] = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

		Arrays.sort(num);
		
		if(num[0] == num[1]) {
			System.out.println("0");
		} else {
			System.out.println(num[1] - num[0] - 1);
		}
		
		for(long i = num[0] + 1; i < num[1]; i++) {
			System.out.print(i + " ");
		}
	}
}