import java.io.*;
import java.util.*;

public class day80 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		while(true) {
			st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			if(n == 0 && m == 0) {
				break;
			}

			HashSet<Integer> cd = new HashSet<Integer>();
			
			for(int i = 0; i < (n < m ? n : m); i++) {
				cd.add(Integer.parseInt(in.readLine()));
			}

			for(int i = 0; i < (n < m ? n : m); i++) {
				int a = Integer.parseInt(in.readLine());
				if(cd.contains(a)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}
}
//// 다들 고생했어 ㅠ