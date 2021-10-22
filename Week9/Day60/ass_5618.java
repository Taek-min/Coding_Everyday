import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n];
        nums[0] = sc.nextInt();
		int min = nums[0];
		int check = 0; 
		for (int i = 1; i < n; i++){
    		nums[i] = sc.nextInt();
			if(nums[i]<min){
				min = nums[i];
			}
		}
		for(int i = 1; i <= min ; i++){
			for(int k = 0 ; k < nums.length ; k++){
				if(nums[k] % i != 0){
					check = 1;
					break;
				}
			}
			if(check==0) {
				System.out.println(i);
			}
			check = 0;
		}
	}
}