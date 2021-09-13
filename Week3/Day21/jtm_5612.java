import java.util.Scanner;

public class Main { ////엄청 깔끔하네요 good 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minute = sc.nextInt();
		int presentCar = sc.nextInt();
		int max = presentCar;
		
		for(int i = 0; i < minute; i++) {
			int inputCar = sc.nextInt();
			int outputCar = sc.nextInt();
			presentCar = presentCar + inputCar - outputCar;
			
			max = (presentCar < 0) ? 0 : Math.max(presentCar, max);
			if(max == 0)break;
		}
		System.out.println(max);
	}
}