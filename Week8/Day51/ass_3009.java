import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x[] = new int [3];	
		int y[] = new int [3];
		for(int i = 0 ; i < 3 ; i++ ){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		if(x[1] == x[2]) { System.out.printf("%d", x[0]); }
  		else if(x[1] == x[0]) { System.out.printf("%d", x[2]); }
  		else if(x[2] == x[0]) { System.out.printf("%d", x[1]); }
		System.out.printf(" ");
		if(y[1] == y[2]) { System.out.printf("%d", y[0]); }
  		else if(y[1] == y[0]) { System.out.printf("%d", y[2]); }
  		else if(y[2] == y[0]) { System.out.printf("%d", y[1]); }
	}
}
//// 굳:22 : 33