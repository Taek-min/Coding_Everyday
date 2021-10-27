package Day20;
////Good :22
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
//// 버퍼!!!!!!
public class kcm_2869 {

	public static void main(String[] args) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		double climbing = Integer.parseInt(st.nextToken());
		double sliding =  Integer.parseInt(st.nextToken());
		double goal =  Integer.parseInt(st.nextToken());
		double day = (goal- climbing) / (climbing - sliding);
		day = (int)Math.ceil(day);
		System.out.println(day +1);
	}
}

