import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 ////Good
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int stickLength = Integer.parseInt(st.nextToken());
 
		int day = (stickLength - down) / (up - down);
		if ((stickLength - down) % (up - down) != 0) ////여기 {} 넣어주세요라고 했습니다.
			day++;
 
		System.out.println(day);
	}
}