import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputCase = sc.nextInt();
		String[] name = new String[inputCase+1];
		boolean result = false;
		for(int i = 0; i <= inputCase; i++) {
			name[i]  = sc.nextLine();
			
			if(name[i].equals("anj")) {
				result = true;
			}
		}
		if(result) {
			System.out.println("����;");
		}
		else {
			System.out.println("����?");
		}
	}
}
