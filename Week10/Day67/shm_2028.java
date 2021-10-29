import java.util.Scanner;

public class Main {
	public static void main(String[] args) { //// 깜쌈하게 풀으셧네요 :쌈쌈~
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			int num = sc.nextInt();
			boolean selfCopyingNum = Integer.toString(num * num).substring(Integer.toString(num * num).length() - Integer.toString(num).length()).equals(Integer.toString(num));
			if(selfCopyingNum) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
