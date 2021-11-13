import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> set;
		
		while(true) {
			int nums[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int count = 0;
			set = new HashSet<>();
			
			if(nums[0] ==0 && nums[1] ==0) {
				break;
			}
			
			for(int i = 0; i < nums[0]; i++) {
				set.add(Integer.parseInt(in.readLine()));
			}
			
			for(int j = 0; j < nums[1]; j++) {
				if(set.contains(Integer.parseInt(in.readLine()))) {
					count++;	
				}
			}			
			bf.write(count + "\n");
		}
		bf.flush();
		bf.close();
	}
}
//// 다들 고생했어 ㅠ