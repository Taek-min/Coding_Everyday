import java.util.Scanner;

public class Main { ////굳굳 잘하셧네요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 네이밍부터 합격이네 ㅋㅋㅋㅋ
		int numOfProblem = sc.nextInt();
		int score = 0;
		int stack = 0;
		
		for(int i = 0; i < numOfProblem; i++) {
			int problem = sc.nextInt();
			if(problem == 1) { //창민이랑 살짝 다른거같은데 잘했네..
				if(stack > 0) {
					stack++;
					score += stack;
				}
				else{	
					score++;
					stack++;
				}
			}
			else { 
				stack = 0;
			}
		}
		System.out.println(score);
	}
}