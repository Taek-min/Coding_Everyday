import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int num1Chk;
		int num2Chk;
		int numChange;
		for(int i = 0 ; i < loop ; i++){
			int num1 = sc.nextInt();
			num1Chk = num1;
			int num2 = sc.nextInt();
			num2Chk = num2;
			while(true){
				if(num2Chk==0){
					break;
				}
				numChange = num2Chk;
				num2Chk = num1Chk % num2Chk;
				num1Chk = numChange;
			}
			System.out.printf("%d %d\n",(num1*num2)/num1Chk, num1Chk);
		}	
	}
}