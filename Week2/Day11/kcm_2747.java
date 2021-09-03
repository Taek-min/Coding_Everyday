package Day11;

import java.util.Scanner;

public class kcm_2747 {
	public static void main(String[] args) {	////GOOD!
	    Scanner in = new Scanner(System.in);
	    int [] fibonachi = new int[46];
	    fibonachi[0] = 0;
	    fibonachi[1] = 1;
		//// 무조건 45번 돌리게 한 부분이 아쉽네요
	    for(int i = 2; i <= 45; i++){
	        fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
	    }
		//// 불필요한 탭 노노
            int amount = in.nextInt();
            System.out.println(fibonachi[amount]);
	}
}