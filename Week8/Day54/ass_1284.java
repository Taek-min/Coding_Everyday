import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String num = sc.nextLine();
			int width = 2;
			if (num.length() == 1 && num.charAt(0) == '0') {
				break;
			}
			for (int i = 0 ; i < num.length() ; i++) {
				if (num.charAt(i) == '1') { width += 2;}
				else if (num.charAt(i) == '0') { width += 4;}
				else { width += 3; }
			}
		width += num.length() - 1;
		System.out.println(width);
		}	
	}
} //// 굳