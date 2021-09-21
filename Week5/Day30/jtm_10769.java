import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int check = 0;
		int smile = 0;
		int sad = 0;
		
		for(char inputString : str.toCharArray()) {
			if (inputString == ':' || (inputString == '-') && check == 1) {
				check++;
				continue;
			}
			else if(check == 2) {
				if(inputString == '(') {
					sad++;
				}
				else if(inputString ==')') {
					smile++;
				}
			}
			check = 0;
		}
		
		int difference = smile - sad;
		if(difference == 0) {
			if(smile == 0) System.out.println("none");
			else System.out.println("unsure");
		}
		else System.out.println(difference > 0 ? "happy" : "sad");
	}
}
