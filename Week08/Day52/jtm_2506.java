import java.util.Scanner;

public class Main{ //// 패키지랑 class 이름 수정해드렸어요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mission = sc.nextInt();
		int result = 0;
		int sum = 0;
		for(int i = 0; i < mission; i++){
		    int ans = sc.nextInt();
		    if(ans == 1){
		        result += ++sum;	////전위 증감 연산자 오랜만에 보네요 굿~ :2 :3 미치네..:4 오 지성이다
		    }
		    else{
		        sum = 0;
		    }
		}
        System.out.println(result);
	}
}