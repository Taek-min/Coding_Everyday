import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i = 0 ; i < line ; i++){
			for(int k = 0 ; k < i ; k++){
				System.out.printf(" ");
			}
			for(int j = line - i ; j >0 ; j --){
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}