package Day18;

import java.util.Scanner;
import java.util.Arrays;

public class kcm_fb_1076 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int index[] = new int[3];
		String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		long sum = 0;
		for(int i =0 ; i < 3; i++) {
			String findColor = in.nextLine();
			////오 기능활영 머쪄
			index[i] = Arrays.asList(colors).indexOf(findColor); //// asList 배워갑니다 ~ : 22
			//index[i] = findIndex(colors, findColor);
		}
		
		//// 까리하긴 한데 세줄로 표현 가능한거라서 뭔가 애매
		for(int j = 0; j < index.length; j++) {
			switch(j) {
			case 0:
				sum += index[j] *10;
				break;
			case 1:
				sum += index[j];
				break;
			case 2:
				sum = sum * (long)Math.pow(10, index[j]);
				break;
			}
		}
		System.out.println(sum);
	}
	
}