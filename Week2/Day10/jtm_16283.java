package algorithm;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sheepPrey = sc.nextInt();
		int goatPrey = sc.nextInt();
		int animal = sc.nextInt();
		int totalPrey = sc.nextInt();
		int goat = 0, sheep =0;
		int cnt = 0;
		int imgGoat = 0, imgSheep = 0;
		
		for(int i = 1; i < animal; i++){
			imgSheep = animal - i;
		    imgGoat = animal - imgSheep;
		    
		    if((goatPrey * imgGoat) + (sheepPrey * imgSheep) == totalPrey){
		        cnt++;
		        goat = imgGoat;
		        sheep = imgSheep;
		    }
		    else{
		        continue;
		    }
		}
		
		if(cnt == 1){
		    System.out.println(sheep + " " + goat);
		}
		else{
		    System.out.println("-1");
		}
		
	}
}

