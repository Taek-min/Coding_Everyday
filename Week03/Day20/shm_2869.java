package Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//// 고생했어 :22
public class shm_2869 { //// 복사본이네
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double move = Integer.parseInt(st.nextToken());
		double slide = Integer.parseInt(st.nextToken());
		double top = Integer.parseInt(st.nextToken());

		int day = (int)Math.ceil((top - move) / (move - slide)) + 1;
		System.out.println(day);
	}
}
