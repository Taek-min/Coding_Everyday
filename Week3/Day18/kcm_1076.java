package Day18;

import java.util.Scanner;
import java.util.Arrays;

public class kcm_1076 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int index[] = new int[3];
		String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		long sum = 0;
		for(int i =0 ; i < 3; i++) {
			String findColor = in.nextLine();
			index[i] = Arrays.asList(colors).indexOf(findColor);
			//index[i] = findIndex(colors, findColor);
		}
		
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
	
	//public static int findIndex(String []color, String name) {
	//	int index = 0;
	//	for(int i= 0; i < color.length; i++) {
	//		if(color[i] == name) {
	//			index = i;
	//			break;
	//		}
	//	}
	//	return index;
	//}
}