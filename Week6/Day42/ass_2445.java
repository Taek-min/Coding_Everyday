import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int starLine = scan.nextInt(); //// 입력이 한 개고 이름 짓기 애매하다면 그냥 문제에서 말하는대로 N이라 지어도 괜춘한듯
		for(int i = 0 ;i<starLine;i++){
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(starLine-i-1)*2;j++){
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    System.out.println("");
		}
		for(int i = starLine-1; i>0; i--){
		       for(int k = 0 ; k<i;k++){ //// 탭정리!
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(starLine-i)*2;j++){
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i;k++){
		        System.out.printf("*");
		    }
		    System.out.println(""); //// "" 없어도 됨
		}
	}
}
//// 굳굳 : 22