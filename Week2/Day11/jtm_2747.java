import java.util.Scanner;

public class Main {
	
	//// 불필요한 줄바꿈 ㄴㄴ
	//// 그리고 자바는 함수가 맨 밑에 있어도 위에서 호출 잘 돼
	static int findFibonacci(int num) {	////함수 잘쓰시네요 
	    int frontNum = 0; //// front/back before/after 중 딱 골라!
	    int afterNum= 1;
	    int result = 0;
	    
	    for (int i = 0; i < num; i++) {
	        result = frontNum + afterNum;
	        frontNum = afterNum;
	        afterNum = result;
	    }
	    return result;
	}

	//// 깔끔하네
	public static void main(String[] args) {
		int num = 0;
		int firstNum = 1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println(firstNum);
		}
		else {
			System.out.println(findFibonacci(num - 1));
		}
	}
}
