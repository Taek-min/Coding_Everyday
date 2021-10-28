import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0&&b==0&&c==0){
				break;
			}
			a *= a;
			b *= b;
			c *= c;
			if(a+b==c||b+c==a||a+c==b){
				System.out.println("right");
			}else System.out.println("wrong");
			
		}
	}
}