import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		K = K+1;
		StringBuilder sb = new StringBuilder();
		int num = 0;
		while(K!=0) {
			num = K%2;
			sb.append(num);
			K = K/2;
		}
		StringBuilder result = new StringBuilder();
		for(int i = sb.toString().length()-2; 0 <= i; i--) {
			if(sb.charAt(i) == '0')
			{
				result.append(4);
			}
			else {
				result.append(7);
			}
		}
		System.out.println(result.toString());
	}
}
//매우 스마트해요
// 잘 풀었어
// 이해했다 이거! 잘했네~?