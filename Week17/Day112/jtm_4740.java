import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String word = sc.nextLine();
			StringBuffer sb = new StringBuffer(word);
			if(word.equals("***")) {
				break;
			}
			System.out.println(sb.reverse());		
		}
	}
	//  다 똒같네 ? : 22 
	
