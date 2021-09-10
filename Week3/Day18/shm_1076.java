package Day18;

import java.util.Scanner;

//// 무난쓰 :2
public class shm_1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resistanceTable[] = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		//// 카멜 표기법! 변수명 첫 글자는 소문자로 / 배열 이름은 앵간하면 복수형으로 해주십쇼
		String Color[] = new String[3];
		String sum = "";
		long total = 0;
		
		for(int i = 0; i < Color.length; i++) {
			Color[i] = sc.nextLine();
			for(int j = 0; j < resistanceTable.length; j++) {
				if(resistanceTable[j].equals(Color[i])) {
					if(i == 0) {
						sum += j;
					}
					else if(i == 1) {
						sum += j;
					}
					else {
						total = Integer.parseInt(sum) * (long)Math.pow(10, j);
						System.out.println(total);
					}
				}
			}
		}
	}
}
