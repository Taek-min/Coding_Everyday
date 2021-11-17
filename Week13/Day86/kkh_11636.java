import java.util.Scanner;
//// 잘했네?
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i = 0; i < T; i++) {
			int turtles = 1;
			int newTurtles = 0; 
			while(true) {
				int nextTurtles = in.nextInt();
				if(nextTurtles == 0) {
					break;
				}
				
				if((turtles * 2) < nextTurtles) {
					newTurtles += nextTurtles - ((turtles * 2));
				} 
				
				turtles = nextTurtles;
			}
			
			System.out.println(newTurtles);
		}
	}
}