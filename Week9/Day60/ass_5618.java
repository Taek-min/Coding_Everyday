import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n];
		nums[0] = sc.nextInt();
        int min = nums[0];
		boolean check = true; 		
		for (int i = 1; i < n; i++){
    		nums[i] = sc.nextInt();
			if(nums[i]<min){
				min = nums[i];
			}
		}
		for(int i = 1; i <= min ; i++){
			for(int k = 0 ; k < nums.length ; k++){
				if(nums[k] % i != 0){
					check = false;
					break;
				}
			}
			if(check) {
				System.out.println(i);
			}
			check = true;
		}
	}
}//// 성수 그래도 성공했네~