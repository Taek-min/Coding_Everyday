import java.util.Scanner;

public class Main { //// 이지했습니다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stone = sc.nextInt();
		
		String result = (stone % 2 == 0) ? "CY" : "SK"; 
		System.out.println(result);
	}
}
