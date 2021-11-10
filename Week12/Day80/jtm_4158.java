import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int m;
		int cnt;
		HashSet<Integer> set;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0) {
				break;
			}
			
			set = new HashSet<>();
			cnt = 0;
			
			for(int i = 0; i < n; i++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			
			for(int j = 0; j < n; j++) {
				int cd = Integer.parseInt(br.readLine());
				
				if(set.contains(cd))
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}