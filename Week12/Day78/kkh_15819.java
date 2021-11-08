import java.util.*;
//// 다 똑같이 풀었네
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int I = in.nextInt();
		in.nextLine();
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = in.nextLine();
		}
		
		Arrays.sort(str);
		
		System.out.println(str[I - 1]);
	}
}