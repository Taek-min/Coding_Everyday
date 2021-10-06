import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] nums = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
    	int[] overlap = new int[9];
    	int max = 0;
    	int cnt = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == 9 || nums[i] == 6) {
    			overlap[6] += 1;
    		}
    		else {
    			overlap[nums[i]] += 1;
    		}
    	}
    	
    	for(int j = 0; j < overlap.length; j++) {
    		if(max <= overlap[j]) {
    			if(j == 6) {
    				cnt = overlap[6] / 2 + overlap[6] % 2;
    			}
    			else {
    				max = overlap[j];
    			}
    		}
    	}
    	
    	if(cnt < max) {
    		System.out.println(max);
    	}
    	else {
    		System.out.println(cnt);
    	}
    }
}
//// 굳 :2:3