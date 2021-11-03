import java.util.*;

public class Main{
	public static void main(String[] args){//// 변수 생성 횟수를 최대한 줄여봅시당 굳굳 :2
		Scanner sc = new Scanner(System.in);
		int num1Chk;
		int num2Chk;
		int numChange;
		int num1 = sc.nextInt(); //// 9번, 11번줄 10, 12번줄 같이 두는게 좋은거 같아요
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
		System.out.printf("%d\n%d",num1Chk,(num1*num2)/num1Chk);	
	}
}