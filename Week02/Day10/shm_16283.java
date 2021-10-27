package Day10;

import java.util.Scanner;

public class shm_16283 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        //// 자바의 변수명은 소문자로 시작하는게 관례
        //// 직관적인 변수명 굳굳
        int SheepFeed = sc.nextInt();
        int GoatFeed = sc.nextInt();
        int totalAnimals = sc.nextInt();
        int totalFeed = sc.nextInt();
        int Sheep = 1;
        int Goat = 1;
        int cnt = 0;
        
        for (int i = 1; i < totalAnimals; i++){
            //// 요렇게 복잡한 수식은
            //// boolean isFoundAnimalAmount = SheepFeed * (totalAnimals - i) + GoatFeed * i == totalFeed; 
        	//// if (isFoundAnimalAmount) {
            //// 이렇게 boolean 변수로 따로 빼 만들고 변수이름으로 설명해주면 가독성이 훨씬 좋아집니다!
            //// 배워갑니다.
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

////깔끔합니당