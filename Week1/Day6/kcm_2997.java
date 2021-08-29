package Day6;
import java.util.Scanner;
public class kcm_2997 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num[] = new int[3]; 
		for(int i =0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		//// 이부분을 함수로 만들어주면 어떨까요??
		for(int i =0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[j] >= num[i]) {	
					int max = num[j];
					num[j] = num[i];
					num[i] = max;			
				}
			}
		}
		if(num[0] - num[1] == num[1] - num[2]) {
			System.out.println(num[0] + (num[0] - num[1]));
		}
		else if(num[0] - num[1] > num[1] - num[2]) {
			if(num[1] + 2 * (num[1] - num[2]) == num[0]) { //// 이건 어떤걸 판단해주기 위한 if문이에요??
				System.out.println(num[1] + num[1] - num[2]);
			}
		}
		else if(num[0] - num[1] < num[1] - num[2]) {
			if(num[1] - 2*(num[0] - num[1]) == num[2]) {
				System.out.println(num[1] -(num[0] - num[1]));
			}
		}	
	}
}
