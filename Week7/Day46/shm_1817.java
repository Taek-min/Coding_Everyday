import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfBooks = sc.nextInt();
		int maxWeightOfBox = sc.nextInt();
		int weightOfBook[] = new int[numOfBooks];
		int amountOfStack = 0;
		int numOfBoxes = 0;
		
		for(int i = 0; i < numOfBooks; i++) {
			weightOfBook[i] = sc.nextInt();
			amountOfStack += weightOfBook[i];
			
			if(amountOfStack > maxWeightOfBox) {
				numOfBoxes++;
				amountOfStack = weightOfBook[i];
			}
			else if(amountOfStack == maxWeightOfBox) {
				numOfBoxes++;
				amountOfStack = 0;
				continue;
			}
			
			if(amountOfStack <= maxWeightOfBox){
				if(i == numOfBooks - 1) {
					numOfBoxes++;
				}
			}
		}
		System.out.println(numOfBoxes);
	}
}
