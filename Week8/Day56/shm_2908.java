import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		int previous1 = Integer.parseInt(num[0]);
		int previous2 = Integer.parseInt(num[1]);
		int reverse1 = (previous1 % 10) * 100 + (previous1 % 100 / 10) * 10 + previous1 / 100;
		int reverse2 = (previous2 % 10) * 100 + (previous2 % 100 / 10) * 10 + previous2 / 100;
		
		System.out.println((reverse1 > reverse2)?reverse1:reverse2);
	}
}//// 깔삼하네? :2
