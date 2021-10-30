import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main//깔꼼해~
{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArray = br.readLine().toCharArray();
		
		for (int i = 0; i < charArray.length; ++i) {
			charArray[i] = (char)(charArray[i] - 3);
			if (charArray[i] < 65) {
				charArray[i] += 26;
			}
			System.out.print(charArray[i]);
		}   	
	}
}


