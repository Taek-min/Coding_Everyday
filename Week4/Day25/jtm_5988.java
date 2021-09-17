package algorithm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			//// int[] nums = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray(); // java.util.Arrays 임포트해야됨
			//// 팁: 위처럼하면 곧바로 int[]로 변환할 수 있음
			//// 지금은 배열 원소가 두개뿐이라 저걸 쓰긴 투머치하긴한데, 자바에선 Stream이라는거 잘 활용하면 정~말 유용하니 10분정도라도 시간 내서 찾아보면 좋겠다는 의미로 피드백 남김

			//// 아니면 sc.nextInt()를 두번하면 정수 2개로 각각 받아와짐
			String num[] = sc.next().split("");
			
			String result = ((Integer.parseInt(num[num.length-1])) % 2 == 0) ? "even" : "odd" ;
			System.out.println(result);
		}
	}
}
