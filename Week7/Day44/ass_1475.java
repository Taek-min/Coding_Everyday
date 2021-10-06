import java.util.Scanner;
////정직한 구현이네요!
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int cnt = 0;
		int maxCnt = 0;
		for(int i = 0; i < 9; i++){
		    for(int k = 0; k < num.length(); k++){
		       if(i==6){
                   if('6'==num.charAt(k)||'9'== num.charAt(k)){
		           cnt++; //// 여기도 탭 해주소
                   }
               }else if(i==num.charAt(k)-'0'){
		           cnt++;
		       }
		    }
		    if(i==6){
                cnt=(cnt+1)/2;
            }
            if(maxCnt<cnt){
		        maxCnt=cnt;
		    }
            cnt=0;
		}
		System.out.println(maxCnt);
	}
}
//// 굳 :2 : 3 :4