package algorithm;

import java.util.Scanner;

public class Main2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mission = sc.nextInt();
		int result = 0;
		int sum = 0;
		for(int i = 0; i < mission; i++){
		    int ans = sc.nextInt();
		    if(ans == 1){
		        result += ++sum;	////전위 증감 연산자 오랜만에 보네요 굿~ 
		    }
		    else{
		        sum = 0;
		    }
		}
        System.out.println(result);
	}
}