import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] num = new int[3];
    	for(int i = 0; i < num.length; i++) {
    		num[i] = sc.nextInt();
    	}
    	String str = sc.next();
    	Arrays.sort(num);
        for (int j = 0; j < num.length; j++) {
            if ('A' == str.charAt(j)) {
                System.out.print(num[0] + " ");
            } else if ('B' == str.charAt(j)) {
                System.out.print(num[1] + " ");
            } else if ('C' == str.charAt(j)) {
                System.out.print(num[2] + " ");
            }
        }
    }
}