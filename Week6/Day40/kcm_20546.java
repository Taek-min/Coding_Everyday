import java.util.Scanner;

//// 승빈 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_wsb.java
//// 진홍 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_kjh.java
//// 복잡한 구현 문제인만큼 main의 길이가 꽤 길게 나왔는데, 다음에는 위처럼 함수나 클래스로 뽑아내보려고 궁리해보면 좋을 것 같습니다
//// ㅋㅋ good
public class Main {
	public static void main(String[] args) {
		// 줄 지우기(아마?)
		Scanner in = new Scanner(System.in);
		int junhyunCoin = 0;
		int sungminCoin = 0;
		int junhyunMoney = in.nextInt();
		int sungminMoney = junhyunMoney;
		int downcount = 0;
		int upcount = 0;
		int todayStock[] = new int[14];
		int beforeValue = 0;
		
		for(int i = 0; i < todayStock.length; i++) {
			todayStock[i] = in.nextInt();
			beforeValue = todayStock[0];
		}////얘는.. 띄어도... 괜찮지.. 않을까..?
		for(int j = 0; j < todayStock.length-1; j++) {
			if(junhyunMoney / todayStock[j] > 0) {
				junhyunCoin += junhyunMoney / todayStock[j];
				junhyunMoney -= ((junhyunMoney / todayStock[j]) * todayStock[j]);	
			}
			if(beforeValue < todayStock[j]) {
				upcount++;
				downcount = 0;
			}
			else if(beforeValue > todayStock[j]){
				downcount++;
				upcount = 0;
			}
			else {
				upcount = 0;
				downcount = 0;
			}
			if(upcount == 3) {
				if(sungminCoin > 0) {
					sungminMoney += sungminCoin * todayStock[j+1];
					sungminCoin = 0;
				}
				upcount = 0;
			}
			else if(downcount == 3) {
				if(sungminMoney / todayStock[j] > 0) {
					sungminCoin += sungminMoney / todayStock[j];
					sungminMoney -= ((sungminMoney / todayStock[j]) * todayStock[j]);
				}
				downcount = 0;
			}
			beforeValue = todayStock[j];
		}
		
		if(sungminMoney + sungminCoin * todayStock[13] == junhyunMoney + junhyunCoin * todayStock[13]) {
			System.out.println("SAMESAME");
		}
		else if(sungminMoney + sungminCoin * todayStock[13] > junhyunMoney + junhyunCoin * todayStock[13]) {
			System.out.println("TIMING");
		}
		else {
			System.out.println("BNP");
		}
	}
}
//// 잘해융~~~:22