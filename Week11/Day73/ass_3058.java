import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int nums[] = new int [7];
		for(int i = 0 ; i < loop ; i++){
			int min = 100;
			int add = 0;
			for(int k = 0 ; k < 7 ; k++){
				nums[k] = sc.nextInt();
				if(nums[k]%2==0){
					if(min > nums[k]) min = nums[k];
					add += nums[k];
				}
				if(k==6) System.out.printf("%d %d\n",add, min);
			}
		}
	}
}