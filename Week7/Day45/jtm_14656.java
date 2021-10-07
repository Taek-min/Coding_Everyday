import java.util.*;

//// 굿
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int student = sc.nextInt();
    	int[] order = new int[student];
    	int answer = 0;
    	
    	for(int i = 0; i < student; i++) {
    		order[i] = sc.nextInt();
    		if(order[i] - 1 == i) {
    			answer++;
    		}
    	}
    	System.out.println(student - answer);
    }
}
