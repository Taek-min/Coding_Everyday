import java.util.*;
import java.io.*;

public class Day8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num =Integer.parseInt(br.readLine());
        int min=0;
		Integer[] seeding = new Integer[num];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i = 0; i < num; i++) {
			seeding[i]=Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(seeding, Collections.reverseOrder());
		for(int i = 0; i < num; i++) {
			seeding[i] = seeding[i] + i + 1;
			if(seeding[i] > min){
                min = seeding[i];
            }
		}
		System.out.println(min + 1);
    }
}
/// 토큰 좀 치네 : 왜 따라해 물론 내가 늦었긴 하지만 
