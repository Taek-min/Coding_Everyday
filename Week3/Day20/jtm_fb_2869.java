import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 ////Good : 22
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int stickLength = Integer.parseInt(st.nextToken());
 
		int day = (stickLength - down) / (up - down);
		if ((stickLength - down) % (up - down) != 0){
			day++;
		}
		System.out.println(day);
	}
}
