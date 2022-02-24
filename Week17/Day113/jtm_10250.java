import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 0; i < testCase; i++) {
			int totalFloor = sc.nextInt();
			int room = sc.nextInt();
			int guest = sc.nextInt();
			int floor = 0;
			int ho = 0;
			floor = guest % totalFloor ;
			ho = guest / totalFloor;
			
			assignGuest(ho, floor, totalFloor);
		}
		
	}
	
	public static void assignGuest(int ho, int floor, int totalFloor) {
		if(floor == 0) {
			System.out.println((totalFloor * 100) + ho);
		}
		else {
			System.out.println((floor * 100) + (ho+1));
		}
	}
}

//택민이두 잘하네~? : 22