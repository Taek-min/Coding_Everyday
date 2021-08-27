package algorithm;
import java.util.Scanner;

public class Main {
    
	static int maxNum(int a, int b, int c) {
		//// max 변수를 담을 이유가 없어보임. 그냥 바로 return 하는게 깔끔했을 듯
		int max = 0;
		if(a > b) {
			if(b > c)
				max = a;
			else 
				max = (a > c) ? a : c;
		}
		
		//// 위 조건에서 return이 됐으면 자연스럽게 else문도 필요없게 됨
		else 
			max = (b > c) ? b : c;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			String result = "";
			if(a == 0 && b == 0 && c == 0)
				break;
			
			int max = maxNum(a, b, c);
			
			//// AND 문 어디다 팔아먹었어
			//// 그리고 Invalid 판별은 그냥 max >= (a+b+c-max)를 체크하면 됐음
			if(a == max) {
				if(a >= b+c)
					result = "Invalid";
			}
			else if(b == max){
				if(b >= a + c)
					result = "Invalid";
			}
			else {
				if(c >= a + b)
					result = "Invalid";
			}
			
			if(result == "" && a == b && b == c )
				result = "Equilateral";
			else if(result == "" && (a == b && b != c) || (a == c && b != c) || (b == c && a != b))
				result = "Isosceles";
			else if(result == "" && a != b && b != c && a != c)
				result = "Scalene";
			
			System.out.println(result);
			
		}
		sc.close();
	}
}
