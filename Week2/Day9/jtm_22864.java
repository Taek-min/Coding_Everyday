package algorithm;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int increaseFatigue= sc.nextInt(); 
		int dailyThroughput = sc.nextInt(); 
		int decreaseFatigue = sc.nextInt(); 
		int totalFatigue = sc.nextInt(); 
		//// 변수명은 소문자로 시작!
		int Fatigue = 0, work = 0, hours = 0;
		
		//// 반복횟수가 정해진건 for문으로 하는게 직관적일 것 같슴다:22 
		while(hours < 24){
			//// 탭정리 매우 불-편
			if (totalFatigue < Fatigue + increaseFatigue){
				////왜 여기서 이 값을 빼주는지 잘 모르겠어
				Fatigue -= decreaseFatigue;
			    hours++;
			    if(Fatigue < 0){
			    	Fatigue = 0;
			    	}
			        continue;
			    }
			
			    Fatigue += increaseFatigue;
			    hours++;
			    work += dailyThroughput;
			    }
		System.out.println(work);
		}
	}


