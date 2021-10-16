import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int address[] = Arrays.stream(in.next().split("")).mapToInt(Integer::parseInt).toArray();
			int area = 2;
			if(address[0] == 0) {
				break;
			}
			for(int i = 0; i < address.length; i++) {
				if(address[i] == 1) {
					area += 2;
				}
				else if(address[i] == 0) {
					area += 4;
				}
				else {
					area += 3;
				}
			}
			System.out.println(area + (address.length -1));
		}
	}
}
////정석이야~ :2
