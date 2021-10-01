import java.util.Scanner;

//// 깔끔 : 2 
public class Main { //// 이 아래 줄바꿈 안하는게 국룰 :2 : 3

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [][]nums = new int[9][9];
		int max = 0;
		int vertical = 0;
		int horizontal = 0; //// 이 아래랑
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = in.nextInt();
				if(nums[i][j] > max) {
					max = nums[i][j];
					vertical = i+1;
					horizontal = j+1;
				}
			}
		} 
		System.out.println(max); //// 이 위 같은데에 줄바꿈 넣어주면 가독성 더 좋을 것 같아요. 코드 맥락이 바뀐다는 것을 간접적으로 나타내주기도 하고요
		System.out.println(vertical + " " + horizontal);
	}
}