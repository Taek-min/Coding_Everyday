import java.util.*;

public class Main{
	public static void main(String[] args){////굳굳 
		Scanner sc = new Scanner(System.in);	
		int testCase = sc.nextInt();
		int num;
		String strnum;
		String squared;
		for(int i = 0 ; i < testCase ; i++){
			num = sc.nextInt();
			strnum = String.valueOf(num);
			num*=num;
			squared = String.valueOf(num);
			if(strnum.equals(squared.substring(squared.length()-strnum.length()))){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}