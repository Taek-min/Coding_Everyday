import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int digit = sc.nextInt();
		int frequency = 0;
		for(int i=1; i<=N; i++){
		int num = i;
			while(num>0){
				if(num % 10 == digit) 
                    			frequency++;
				num /= 10;
			}
		}
		System.out.println(frequency);
	}
}
