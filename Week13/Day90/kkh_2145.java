import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true) {
			String num = in.nextLine();
			int sum = 0;
			
			if(num.equals("0")) {
				break;
			}
			
			char[] numChar = String.valueOf(num).toCharArray();
			
			while(numChar.length > 1) {
				for(int i = 0; i < numChar.length; i++) {
					sum += Character.getNumericValue(numChar[i]);					
				}

				numChar = String.valueOf(sum).toCharArray();
				sum = 0;
			}
			System.out.println(numChar[0]);
		}
	}
}
