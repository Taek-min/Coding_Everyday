import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.nextLine();
			StringBuffer sb = new StringBuffer(str);
			
			if(str.equals("***")) {
				break;
			}
			System.out.println(sb.reverse());
		}
	}
}
