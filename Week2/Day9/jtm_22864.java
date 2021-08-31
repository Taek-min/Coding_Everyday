package algorithm;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int increaseFatigue= sc.nextInt(); 
		int dailyThroughput = sc.nextInt(); 
		int decreaseFatigue = sc.nextInt(); 
		int totalFatigue = sc.nextInt(); 
		int Fatigue = 0, work = 0, hours = 0;
			
		while(hours < 24){
			if (totalFatigue < Fatigue + increaseFatigue){
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


