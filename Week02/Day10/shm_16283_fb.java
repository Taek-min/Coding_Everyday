package Day10;

import java.util.Scanner;

public class shm_16283_fb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sheepFeed = sc.nextInt();
        int goatFeed = sc.nextInt();
        int totalAnimals = sc.nextInt();
        int totalFeed = sc.nextInt();
        int sheep = 1;
        int goat = 1;
        int cnt = 0;
        
        for (int i = 1; i < totalAnimals; i++){
        	boolean accordAnimalFeed = sheepFeed * (totalAnimals - i) + goatFeed * i == totalFeed;
            if(accordAnimalFeed){
            	cnt++;
        		sheep = totalAnimals - i;
        		goat = i;
            }
        }
        
        if (cnt == 1) {
        	System.out.printf("%d %d\n", sheep, goat);
        }
        else
        	System.out.println(-1);
	}
}

