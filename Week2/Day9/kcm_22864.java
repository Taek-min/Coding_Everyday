package Day9;

import java.util.Scanner;

public class kcm_22864 {
	
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int Fatigue = in.nextInt(); 
    	int work= in.nextInt();  
    	int rest = in.nextInt(); 
    	int maxFatigue = in.nextInt();
    	int nowTime = 0;
    	int nowFatigue = 0;
    	int nowWork = 0;
    	while(nowTime < 24){
        	if(nowFatigue + Fatigue > maxFatigue){
            	nowTime++;
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