package Day11;

import java.util.Scanner;

public class kcm_2747 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int [] fibonachi = new int[46];
	    fibonachi[0] = 0;
	    fibonachi[1] = 1;     
	    for(int i = 2; i <= 45; i++){
	        fibonachi[i] = fibonachi[i - 1] + fibonachi[i - 2];
	    }
            int amount = in.nextInt();
            System.out.println(fibonachi[amount]);
	}
}