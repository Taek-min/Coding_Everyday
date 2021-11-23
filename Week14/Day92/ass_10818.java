import java.util.*;

public class Main {
    public static void main(String[] args) { //// 정석 굳
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int nums[] = new int [num];
		
		nums[0] = sc.nextInt();
		int max = nums[0];
		int min = nums[0];
        
		for (int i = 1; i < num; i++) {
		    nums[i] = sc.nextInt();
			if(max < nums[i]){
				max = nums[i];
			}
			if(min > nums[i]){
				min = nums[i];
			}
	    }
		System.out.println(min + " " + max);
    }
}