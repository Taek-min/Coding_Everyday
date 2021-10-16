import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sum = 0;
			String num = sc.nextLine();
			
			if(num.equals("0")) {
				break;
			}
			
			for(int i = 0; i < num.length(); i++) {
				if(num.charAt(i) == '0') {
					sum += 4;
				}
				else if(num.charAt(i) == '1') {
					sum += 2;
				}
				else {
					sum += 3;
				}
			}
			System.out.println(sum + num.length() + 1);
		}
	}
}
//// 다들 비슷하게 풀엇네용
