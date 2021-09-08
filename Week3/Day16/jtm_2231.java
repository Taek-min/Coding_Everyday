package algorithm;
import java.util.Scanner;

//// 깔끔 : 22 : 3
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int input = sc.nextInt();
		int result = 0;

		for(int i = 0; i < input; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == input) {
				result = i;
				break;
			}
			
			//// ↖ 불필요한 줄바꿈
		}
 
		System.out.println(result);
		sc.close();
	}
}


