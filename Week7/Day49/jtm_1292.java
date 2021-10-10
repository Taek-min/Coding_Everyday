import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	int sum = 0, cnt = 0;
    	
    	for(int i = 1; i <= num2; i++) {
    		for(int j = 0; j < i; j++) {
    			cnt++;
    			if(num1 <= cnt  && cnt <= num2) {
    				sum += i;
    			}
    		}
    	}
    	System.out.println(sum);
    }
}
