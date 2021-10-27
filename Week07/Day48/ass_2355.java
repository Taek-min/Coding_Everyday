import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long A = scan.nextInt();
		long B = scan.nextInt();
		long sum;
		if(A > B){
		   sum=(A - B + 1) * (A + B) / 2; 
		}else{
		   sum=(B - A + 1) * (B + A) / 2;
		}
		System.out.println(sum);
	}
}
//// 깔끔:22:33: 성수한테 깔끔 주기 싫은데.... 봐준다 :44 봐준다