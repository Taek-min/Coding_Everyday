package Day10;

import java.util.Scanner;

public class shm_16283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int SheepFeed = sc.nextInt();
        int GoatFeed = sc.nextInt();
        int totalAnimals = sc.nextInt();
        int totalFeed = sc.nextInt();
        int Sheep = 1;
        int Goat = 1;
        int cnt = 0;
        
        for (int i = 1; i < totalAnimals; i++){
        	if(SheepFeed * (totalAnimals - i) + GoatFeed * i == totalFeed){
        		cnt++;
        		Sheep = totalAnimals - i;
        		Goat = i;
        	}
        }
        if (cnt == 1) {
        	System.out.printf("%d %d\n", Sheep, Goat);
        }
        else
        	System.out.println(-1);
	}
}

