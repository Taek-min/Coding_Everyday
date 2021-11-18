import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long target_f[] = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long target_s[] = Arrays.stream(in.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		long d = (long) ((long) Math.pow(target_f[0] - target_s[0], 2) + Math.pow(target_f[1] - target_s[1], 2));
		
		if((long)Math.pow(target_f[2] + target_s[2], 2) > d) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
