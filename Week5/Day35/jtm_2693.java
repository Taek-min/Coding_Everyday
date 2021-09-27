import java.util.*;

//// 깔끔
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] num = new int[10];
		
		for(int i = 0; i < testCase; i++) {
			for(int j = 0; j < 10; j++) {
				num[j] = sc.nextInt(); ////걍 이렇게 받을껄 split하고 난리쳤네 :2 바보.
			}
			Arrays.sort(num);
			System.out.println(num[7]);
		}
	}
}
