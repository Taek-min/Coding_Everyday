import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		for(int i = 0 ; i < 9 ; i++){
			int pay = sc.nextInt();
			total -= pay;
		}

		System.out.println(total);
	}
}