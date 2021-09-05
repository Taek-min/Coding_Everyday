package algorithm;
import java.util.Scanner;

public class Main //// 굳굳 : 22 함수활용 너무 좋아요~ :33
{
	static boolean[] cupNum = {true, false, false};
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int swapTime = sc.nextInt();
		int x, y;
		

		//// 줄바꿈 불필요하게 2번 ㄴㄴ
		for(int i = 0; i < swapTime; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			swap(x,y);
		}
		findBall();
	}
	
	static void swap(int x, int y){
		boolean tmp = cupNum[x-1];
	    cupNum[x-1] = cupNum[y-1];
	    cupNum[y-1] = tmp;
		return;
	}

    //// '찾기'만 하지 않고 '출력'도 하기때문에 print가 더 괜춘했을듯
	static void findBall(){
		for(int i = 0; i < 3; i++) {
			if(cupNum[i] == true) {
				System.out.println(i+1);
			}
		}
	}
}
