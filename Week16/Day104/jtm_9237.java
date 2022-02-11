import java.util.*;

public class Main {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int cnt = 2;
        int result = 0;
        Integer days[] = new Integer[seed];
        
        for (int i = 0; i < seed; i++) {
            days[i] = sc.nextInt();
        }
        Arrays.sort(days, Collections.reverseOrder());
 
        for (int i = 0; i < seed; i++) {
        	result = Math.max(result, cnt + days[i]);
            cnt++;
        }
        System.out.println(result);
    }
}
