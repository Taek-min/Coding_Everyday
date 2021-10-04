import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	for(int i = 1; i <= num; i++) {
    		for (int j = i; 0 < j; j--) System.out.print("*");
    		for (int k = 2 * num - 2 * i; k > 0;k--) System.out.print(" ");
    		for (int l = i; 0 < l; l--)System.out.print("*");
    		System.out.println();
    	}
    	
    	for(int i = num - 1; 0 < i; i--) {
    		for (int j = i; 0 < j; j--) System.out.print("*");
    		for (int k = 2 * num - 2 * i; 0 < k; k--) System.out.print(" ");
    		for (int l = i; 0 < l; l--)System.out.print("*");
    		System.out.println();
    	}
    }
}
////굳