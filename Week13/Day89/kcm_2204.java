import java.util.Arrays;
import java.util.Scanner;

public class kcm_2204 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int testCase = in.nextInt();
			in.nextLine();

			if(testCase == 0) {
				break;
			}

			String str[] = new String[testCase];
			String changeStr[] = new String[testCase];

			for(int i = 0; i < testCase; i++) {
				str[i] = in.nextLine();
				changeStr[i] = str[i].toLowerCase();
			}

			Arrays.sort(changeStr);
			
			for(int j = 0; j < testCase; j++) {
				if(str[j].toLowerCase().equals(changeStr[0])) {
					System.out.println(str[j]);
					break;
				}
			}
		}
	}
}
