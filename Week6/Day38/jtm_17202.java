import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String firstPhone = sc.nextLine();
		String secendPhone = sc.nextLine();
		String mixPhone= "";
		for (int i = 0; i < 8; i++) {
			mixPhone += firstPhone.charAt(i) - '0' ;
			mixPhone += secendPhone.charAt(i) - '0' ;
		}
		printOfCompatibility(mixPhone);
	}
	
	static void printOfCompatibility(String compatibility) {
		while(compatibility.length()!=2) {
			String combine="";
			for(int i = 0;i < compatibility.length() - 1; i++) {
				combine += (compatibility.charAt(i) + compatibility.charAt(i+1)-'0'*2)%10;
			}
			compatibility = combine;
		}
		System.out.println(compatibility);
	}
}