package algorithm;
import java.util.Scanner;

public class Main {

	static int maxNum(int a, int b, int c) {	//// 함수 활용 까먹었는데 그래도 잘 활용하시네요 참고하겠습니당.
		//// max 변수를 담을 이유가 없어보임. 그냥 바로 return 하는게 깔끔했을 듯 :: 22
		int max = 0;
		if(a > b) {
			if(b > c)
				max = a;
			else 
				max = (a > c) ? a : c;
		}
		
		//// 위 조건에서 return이 됐으면 자연스럽게 else문도 필요없게 됨 :: 22
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
			//// 그리고 Invalid 판별은 그냥 max >= (a+b+c-max)를 체크하면 됐음 :33
			if(max >= (a+b+c-max)) {
					result = "Invalid";
			}
	
			////Invalid 로 판정된 애들은 여기까지 안내려오게 해주면 더 좋을 거 같아요!
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