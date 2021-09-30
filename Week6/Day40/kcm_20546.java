import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int junhyunCoin = 0;
		int sungminCoin = 0;
		int junhyun = in.nextInt();
		int sungmin = junhyun;
		int downcount = 0;
		int upcount = 0;
		int todayStock[] = new int[14];
		int temp = 0;

		for(int i = 0; i < todayStock.length; i++) {
			todayStock[i] = in.nextInt();
			temp = todayStock[0];
		}
		for(int j = 0; j < todayStock.length-1; j++) {
			if(junhyun / todayStock[j] > 0) {
				junhyunCoin += junhyun / todayStock[j];
				junhyun -= ((junhyun / todayStock[j]) * todayStock[j]);	
			}

			if(temp < todayStock[j]) {
				upcount++;
				downcount = 0;
			}
			else if(temp > todayStock[j]){
				downcount++;
				upcount = 0;
			}
			else {
				upcount = 0;
				downcount = 0;
			}
			
			if(upcount == 3) {
				if(sungminCoin > 0) {
					sungmin += sungminCoin * todayStock[j+1];
					sungminCoin = 0;
				}
				upcount = 0;
			}
			else if(downcount == 3) {
				if(sungmin / todayStock[j] > 0) {
					sungminCoin += sungmin / todayStock[j];
					sungmin -= ((sungmin / todayStock[j]) * todayStock[j]);
				}
				downcount = 0;
			}
			temp = todayStock[j];
		}

		if(sungmin + sungminCoin * todayStock[13] == junhyun + junhyunCoin * todayStock[13]) {
			System.out.println("SAMESAME");
		}
		else if(sungmin + sungminCoin * todayStock[13] > junhyun + junhyunCoin * todayStock[13]) {
			System.out.println("TIMING");
		}
		else {
			System.out.println("BNP");
		}
	}
}
