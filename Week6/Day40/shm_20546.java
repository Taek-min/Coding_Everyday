import java.util.Scanner;

//// 승빈 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_wsb.java
//// 진홍 코드: https://github.com/Eighteeen/BOJ_Algorithm_Study/blob/main/Study4%20-%20Bitmask/Week22/Day151/boj20546_kjh.java
//// 복잡한 구현 문제인만큼 main의 길이가 꽤 길게 나왔는데, 다음에는 위처럼 함수나 클래스로 뽑아내보려고 궁리해보면 좋을 것 같습니다 : 배워갑니당~~
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int givenMoney = sc.nextInt();
		int junHyun = givenMoney;
		int seongMin = givenMoney;
		int stockIndex[] = new int[14];
		int upCnt = 0;
		int downCnt = 0;
		int hyunBuying = 0;
		int minBuying = 0;
		boolean chk = true;
		
		for(int i = 0; i < stockIndex.length; i++) {
			stockIndex[i] += sc.nextInt();
		}
		
		for(int i = 0; i < stockIndex.length; i++) {
			if(i == stockIndex.length - 1) {
				junHyun += stockIndex[i] * hyunBuying;
				if(chk) {
					seongMin += stockIndex[i] * minBuying;
				}
				break;
			}
			
			if(stockIndex[i] <= junHyun) {
				hyunBuying += junHyun / stockIndex[i];
				junHyun %= stockIndex[i]; ////이건 배워갑니다~ 
			}
			
			if(downCnt <= -3 && stockIndex[i] <= seongMin) {
				minBuying += seongMin / stockIndex[i];
				seongMin %= stockIndex[i];
				chk = true;
			}
			else if(upCnt >= 3 && minBuying != 0) {
				seongMin += stockIndex[i] * minBuying;
				chk = false;
			}
			
			if(stockIndex[i] < stockIndex[i + 1]) {
				upCnt++;
				downCnt = 0;
			}
			else if(stockIndex[i] > stockIndex[i + 1]){
				downCnt--;
				upCnt = 0;
			}
			else {
				upCnt = 0;
				downCnt = 0;
			}
		}
	
		if(junHyun > seongMin) {
			System.out.println("BNP");
		}
		else if(junHyun < seongMin){
			System.out.println("TIMING");
		}
		else {
			System.out.println("SAMESAME");
		}
	}
}
//// 멋져요~