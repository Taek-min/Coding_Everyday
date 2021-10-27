import java.util.Scanner;

public class Main{

	static int findFibonacci(int num) {
	    int frontNum = 0; 
	    int afterNum= 1;
	    int result = 0;
	    
	    for (int i = 0; i < num; i++) {
	        result = frontNum + afterNum;
	        frontNum = afterNum;
	        afterNum = result;
	    }
		
	    return afterNum;
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			System.out.println(findFibonacci(num-1));
	}
}
