import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray(); ////여기 뭔가 막 많네 공부할게요~
		Arrays.sort(num);
		
		for(int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}
}
//// 반복문 안쓰고 하셔야죠