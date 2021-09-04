package Day12;

import java.util.Scanner;

public class kcm_2562 {
	public static void main(String[] args) { ////깔꼼 :22
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int location = 0;
		
		for(int i = 1; i < 10; i++){
			int num = in.nextInt();
			if(max < num){
				max = num;
				location = i;
			}
		}
        System.out.println(max);
		System.out.println(location);
	}

}
