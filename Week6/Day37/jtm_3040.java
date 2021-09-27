package algorithm;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hatNum = new int[9];
		int sumHat = 0;
		
		for(int i = 0; i < hatNum.length; i++) {
			hatNum[i] = sc.nextInt();
			sumHat += hatNum[i];
		}
		findLieDwarf(hatNum, sumHat);
		sc.close();
	}
	
	static void findLieDwarf(int[] hatNum, int sumHat) {
		for(int j = 0; j < hatNum.length; j++) {
			for(int k = hatNum.length-1; j < k; k--) {
				if(hatNum[j] + hatNum[k] == sumHat-100) {
					hatNum[j] = 0;
					hatNum[k] = 0;
					printRealDwarf(hatNum);
					return;
				}
			}
		}
	}
	
	static void printRealDwarf(int[] hatNum) {
		for(int i = 0; i < hatNum.length; i++) {
			if(hatNum[i] != 0) {
				System.out.println(hatNum[i]);
			}
		}
	}
}