import java.util.Scanner;

//// 깔끔
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int innerTrain = 0;
		int maxPassenger = 0;
		for(int station = 1; station <= 10; station++) {
			int offTrain = sc.nextInt();
			int onTrain = sc.nextInt();
			innerTrain -= offTrain;
			innerTrain += onTrain;
			
			if(maxPassenger < innerTrain) {
				maxPassenger = innerTrain;
			}
		}
		System.out.println(maxPassenger);
	}
}
