import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int check = 0;
		String result = ""; 

		for(int i = 1; i <= 5; i++) {
			String str = in.nextLine();
			if(str.indexOf("FBI") != -1) {
				result += i + " ";
				check++;
			}
		}
		
		if(check > 0){
			System.out.println(result);
		}
		else {
			System.out.println("HE GOT AWAY!");
		}
	}
}
