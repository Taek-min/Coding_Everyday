package Day10

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int sheepFeed = in.nextInt();
	    int goatFeed = in.nextInt();
	    int animalAmount = in.nextInt();    
	    int allFeed = in.nextInt();   
	    int count = 0;
	    int sheepAmount = 0 ;
	    int goatAmount = 0;

	    for(int sheep = 1; sheep < animalAmount; sheep++){
	        int nowFeed = 0;
	        nowFeed += (sheepFeed * sheep);
	        for(int goat = animalAmount - sheep; goat + sheep <= animalAmount; goat++){
	            nowFeed += goatFeed * goat;
	            if(nowFeed == allFeed){
	                count++;
	                sheepAmount = sheep;
	                goatAmount = goat;
	            }
	        }
	    }
        if(count == 1){
            System.out.println(sheepAmount + " " + goatAmount);
        }
        else{
            System.out.println(-1);
        }
	}
}