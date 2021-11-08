import java.util.Scanner;
import java.util.Arrays;
//// 다 똑같이 풀었네
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loop = in.nextInt();
		int searchHandle = in.nextInt();
		in.nextLine();
		String handles[] = new String[loop];

		for(int i = 0; i < loop; i++) {
			handles[i] = in.nextLine();
		}
		
		Arrays.sort(handles);
		System.out.println(handles[searchHandle -1]);
	}

}
