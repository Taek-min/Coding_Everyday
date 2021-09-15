package algorithm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		////아 ~ 변수명이 아쉽네요~ :2 :3 tmp로 얼버무린 것도 아쉬워요 
			int B = sc.nextInt(); 
			int N = sc.nextInt();
			
			if(B == 0 && N == 0) {
				break;
			}
			
			int result = 1;
			int preMultiplier = 1;
			////공식을 활용했으면 더 간단했을거 같기도 해요
			for(int multiplier = 1; ; multiplier++) {
				int tmp = 1;
				
				for(int i = 0; i < N; i++) {
					tmp = tmp * multiplier;
				}
				
				if(Math.abs(tmp - B) < Math.abs(B - preMultiplier)) {
					result = multiplier;
					preMultiplier = tmp;
				}
				
				if(tmp > B) {
					break;
				}
			}
			System.out.println(result);
		}
	}
}
