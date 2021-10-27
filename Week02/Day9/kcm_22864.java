package Day9;

import java.util.Scanner;

public class kcm_22864 {
	//// 내가 참고한 코드라 쓸말이없넹 ㅎㅎ
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		//// 변수명은 소문자로 시작!
    	int Fatigue = in.nextInt(); 
    	int work= in.nextInt();  
    	int rest = in.nextInt(); 
    	int maxFatigue = in.nextInt();
    	int nowTime = 0;
    	int nowFatigue = 0;
    	int nowWork = 0;
    	while(nowTime < 24){ ////택민이랑 피드백 내용 비슷할 듯 , 그래도 굿굿
        	if(nowFatigue + Fatigue > maxFatigue){
            	nowTime++;
		////왜 여기서 이 값을 빼주는지 잘 모르겠어
            	nowFatigue-= rest;
            	if(nowFatigue < 0){
                	nowFatigue = 0;
            	}
            	continue;
        	}
        	nowTime++;
        	nowFatigue += Fatigue;
        	nowWork += work;
    	}
    	System.out.println(nowWork);
	}
}
