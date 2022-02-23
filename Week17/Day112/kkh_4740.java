import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String str = in.nextLine();
			
			if(str.equals("***")) break;
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse().toString());
		}
	} 
}