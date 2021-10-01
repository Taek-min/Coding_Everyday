import java.util.Scanner;
//// ㅋㅋ good
public class Main {
	public static void main(String[] args) {
		
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
		}
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
