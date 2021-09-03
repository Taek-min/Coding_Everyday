import java.util.Scanner;

public class Main {
	
	static int findFibonacci(int num) {	////함수 잘쓰시네요 
	    int frontNum = 0;
	    int afterNum= 1;
	    int result = 0;
	    
	    for (int i = 0; i < num; i++) {
	        result = frontNum + afterNum;
	        frontNum = afterNum;
	        afterNum = result;
	    }
	    return result;
	}

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
