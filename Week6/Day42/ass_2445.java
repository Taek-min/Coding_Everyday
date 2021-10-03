import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int starLine = scan.nextInt();
		for(int i = 0 ;i<starLine;i++){
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(starLine-i-1)*2;j++){
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i+1;k++){
		        System.out.printf("*");
		    }
		    System.out.println("");
		}
		for(int i = starLine-1; i>0; i--){
		       for(int k = 0 ; k<i;k++){
		        System.out.printf("*");
		    }
		    for(int j = 0; j<(starLine-i)*2;j++){
		        System.out.printf(" ");
		    }
		    for(int k = 0 ; k<i;k++){
		        System.out.printf("*");
		    }
		    System.out.println("");
		}
	}
}
