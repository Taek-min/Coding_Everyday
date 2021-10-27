import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0 ;i<N;i++){
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(N-i-1)*2;j++){
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    System.out.println("");
		}
		for(int i = N-1; i>0; i--) {
		    for(int k = 0 ; k<i;k++) { 
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(N-i)*2;j++) {
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i;k++){
		        System.out.printf("*");
		    }
		}
	}
}