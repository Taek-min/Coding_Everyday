import java.util.*;

public class Main{
	public static void main(String[] args){////성수는 배열을 잘쓰네~ :2 :3
		Scanner scan = new Scanner(System.in);
		int quiz = scan.nextInt();
		int point = 0;
        	int cnt = 1;
		//// 이전 값을 기억해주는 변수를 두었으면 배열없이 풀 수 있지 않았을까나?
		int problems[] = new int[quiz];
		for(int i = 0 ; i < quiz ; i++){
			problems[i] = scan.nextInt();  
			if(i>=1){
				if(problems[i]==1){
					if(problems[i-1]==1){
						cnt+=1;
						point+=cnt;
					}else if(problems[i-1]==0){
						cnt = 1;
						point+=1;
					}
                		}
			}else if(problems[i]==1){
                		point+=1;
            		}
		}
		System.out.printf("%d", point);
	}
}
