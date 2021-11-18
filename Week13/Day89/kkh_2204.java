import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int n = in.nextInt();
			String firstStr = "zzzzzzzzzzzzzzzzzzzz";
			
			if(n == 0) break;
			
			for(int i = 0; i < n; i++) {
				String[] str = new String[2];
				str[0] = firstStr;
				str[1] = in.next();
				
				String[] changeStr = new String[2];
				changeStr[0] = str[0].toLowerCase();
				changeStr[1] = str[1].toLowerCase();
				
				Arrays.sort(changeStr);

				if(str[0].toLowerCase().equals(changeStr[0])) {
					firstStr = str[0];
				} else {
					firstStr = str[1];
				}
			}
			
			System.out.println(firstStr);
		}
	}
}