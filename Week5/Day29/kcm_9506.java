import java.util.Scanner;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int num = in.nextInt();
			List<String> perfectNum = new ArrayList<String>();
			int sum = 0;
			String answer = num +" = ";
			if(num == -1) {
				break;
			}
			for(int i = 1; i<num; i++) {
				if(num % i == 0) {
					perfectNum.add(Integer.toString(i)); 
					sum += i;
				}
			}
			if(num == sum) {
				for(int j = 0; j <(perfectNum.size()- 1); j++) {
					answer += perfectNum.get(j);
					answer += " + ";
				}
				answer += perfectNum.get(perfectNum.size()-1);
				System.out.println(answer);
			}	
			else {
				System.out.println(num + " is NOT perfect.");
			}
		}
	}
}
