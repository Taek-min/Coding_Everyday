import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		int num = 0;
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		order += 1;
		
		while(order != 0) {
			num = order % 2;
			sb.append(num);
			order /= 2;
		}
		
		for(int i = sb.toString().length() - 2; i >= 0; i--) {
			if(sb.charAt(i) == '0')
				result.append(4);
			else
				result.append(7);
		}
		
		System.out.println(result.toString());
	}
}
// 다들 잘 푸는구만~