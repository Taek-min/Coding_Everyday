import java.util.*;

//// 깔끔
public class Main { 	////도움받고 가요 ~ 개인적으로 제일 깔끔 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String firstPhone = sc.nextLine();
		String secendPhone = sc.nextLine();
		//// mix는 동사같고 Phone이라고만 하니 이해가 안되는데 mixedPhoneNumber나 mixedNumber 어때요
		String mixPhone= ""; //// = 양옆에 띄어쓰기 넣는게 국룰(자바 코딩 컨벤션에서 권장하는 사항을 국룰로 줄여 말하겠음)
		for (int i = 0; i < 8; i++) {
			mixPhone += firstPhone.charAt(i) - '0' ;
			mixPhone += secendPhone.charAt(i) - '0' ;
		}
		printOfCompatibility(mixPhone);
	}
	
	//// 잘은 모르는데 of 없는게 문법상 맞지않나?
	static void printOfCompatibility(String compatibility) { //함수 사용하는 모습 좋습니다. :2
		while(compatibility.length()!=2) { //// while이랑 ( 사이에 띄어쓰기 하나 넣는게 국룰, != 양옆에 띄어쓰기 넣는게 국룰
			String combine=""; //// 변수명은 동사로 ㄴㄴ combined 등 추천
			for(int i = 0;i < compatibility.length() - 1; i++) { //// for이랑 ( 사이에 띄어쓰기 하나 넣는게 국룰, 세미콜론 뒤에 띄어쓰기 하나 넣는게 국룰
				combine += (compatibility.charAt(i) + compatibility.charAt(i+1)-'0'*2)%10;
			}
			compatibility = combine;
		}
		System.out.println(compatibility);
	}
}
