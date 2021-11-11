import java.util.Scanner;

public class Main { ////이걸 재귀함수로 풀엇네 :배열 싫어ㅜ 재귀함수는 더 싫어ㅜ 잘했네 택민이
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++) {
			int floor = sc.nextInt();
			int num = sc.nextInt();
			System.out.println(find(floor, num));
		}
	}
	
	public static int find(int floor, int num) {
		if(floor == 0 || num == 1) {
			return num;
		}
		return find(floor, num - 1) + find(floor - 1, num);
	}
}
