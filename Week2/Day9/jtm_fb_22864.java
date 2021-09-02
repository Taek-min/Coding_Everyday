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
		int fatigue = 0, work = 0, hours = 0;
		
		//// 반복횟수가 정해진건 for문으로 하는게 직관적일 것 같슴다:22:33 그럼 코드 더 깔끔해질것 같네요. 그래도 굿굿
		//// 넹
		while(hours < 24){
			//// 탭정리 매우 불-편
			if (totalFatigue < fatigue + increaseFatigue){
			    hours++;
			    if(Fatigue < 0){
			    	Fatigue = 0;
			    	}
			        continue;
			    }
			
			    fatigue += increaseFatigue;
			    hours++;
			    work += dailyThroughput;
			    }
		System.out.println(work);
		}
	}


