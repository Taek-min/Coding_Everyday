import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int l = in.nextInt();
		int person[] = new int[n];
		person[0] = 1;
		int count = 0;
		int index = 0;

		while(true) {
			if(person[index] == m) {
				break;
			}
			if(person[index] % 2 == 1) {
				index += l;
				if(index > n-1) {
					index -= n;
				}
			}
			else {
				index -= l;
				if(index < 0) {
					index += n;
				}
			}
			person[index]++;
			count++;		
		}
		
		System.out.println(count);
	}
}
// 잘해잘해