import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long num1 = sc.nextInt();
    	long num2 = sc.nextInt();
    	long max = 0, min = 0;
    	
    	if(A < B) {
    		max = num2;
    		min = num1;
    	}
    	else {
    		max = num1;
    		min = num2;
    	}
    	
    	long result = (max - min + 1) * (max + min) / 2;
    	System.out.println(result);
    }
}
