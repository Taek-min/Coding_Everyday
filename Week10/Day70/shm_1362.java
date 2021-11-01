import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scenario = 1;
		
		while(true) {
			int o = sc.nextInt();
			int w = sc.nextInt();
			boolean die = false;
			
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
					if(w <= 0 || die) {
						System.out.printf("%d RIP\n", scenario++);
					}
					else if(o * 2 > w && o / 2 < w) {
						System.out.printf("%d :-)\n", scenario++);
					}
					else {
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
