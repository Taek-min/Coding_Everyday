import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
			int word = Integer.parseInt(br.readLine());
			if(word == 0) break;
			String wordStr[] = new String[word];
			for (int i = 0; i < word; i++) {
				wordStr[i] = br.readLine();
			}
			Arrays.sort(wordStr, String.CASE_INSENSITIVE_ORDER);
			System.out.println(wordStr[0]);
		}
	}
}