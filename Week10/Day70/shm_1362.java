import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scenario = 1;
		
		while(true) {
			int o = sc.nextInt();
			int w = sc.nextInt();
			boolean die = false; //생각해보니까 그이 다 불리언이네..?
			
			if(o == 0 && w == 0) {
				break;
			}
			
			while(true) {
				String action = sc.next();
				int weight = sc.nextInt();
				
				if(action.equals("F")) {
					w += weight;
				}
				else if(action.equals("E")) {
					w -= weight;
				}
				else if(action.equals("#") && weight == 0){
					if(w <= 0 || die) { //요
						System.out.printf("%d RIP\n", scenario++);
					}
					else if(o * 2 > w && o / 2 < w) { //고
						System.out.printf("%d :-)\n", scenario++);
					}
					else { //지~~
						System.out.printf("%d :-(\n", scenario++);
					}
					break;
				}
				
				if(w <= 0) {
					die = true;
				}
			}
		}
	}
}
//잘해~~~~~