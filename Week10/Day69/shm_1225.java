import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstNum = sc.next();
		String secondNum = sc.next();
		long sum = 0;
		
		for(int i = 0; i < firstNum.length(); i++) {
			for(int j = 0; j < secondNum.length(); j++) {
				sum += (firstNum.charAt(i) - 48) * (secondNum.charAt(j) - 48);
			}
		}
		System.out.println(sum);
	}
}