import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			String str = in.nextLine();
			StringBuffer sb = new StringBuffer(str);
			if(str.equals("***")) {
				break;
			}
			System.out.println(sb.reverse());		
		}
	}
}
