import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer num = new StringTokenizer(str);
		long start = Long.parseLong(num.nextToken());
		long last = Long.parseLong(num.nextToken());
		long sum = (Math.max(start, last) - Math.min(start, last) + 1) * (start + last) / 2;
		System.out.println(sum);
	}
}

//// 버퍼 사용 굳