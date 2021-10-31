import java.util.*;

public class Main{ //// 굳굳 :2
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		String num1[] = sc.next().split("");
		String num2[] = sc.next().split("");
		long total = 0;
		for(int i = 0 ; i < num1.length ; i++){
			for(int k = 0 ; k < num2.length ; k++){
				total=total+(Integer.valueOf(num1[i]).intValue()*Integer.valueOf(num2[k]).intValue());
			}
		}
		System.out.println(total);
	}
}