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
            if(SheepFeed * (totalAnimals - i) + GoatFeed * i == totalFeed){
        		cnt++;
        		Sheep = totalAnimals - i;
        		Goat = i;
        	}
        }
        //// 변수명은 cnt지만 사실상 '양/염소 마리수가 구해졌느냐?'를 저장하는 역할인거같은데
		//// 안 어울리는 변수명도 변수명이지만 없애면 더 깔끔할 것 같아요
		//// Sheep, Goat을 -1로 초기화하고 마지막에 저 두 값이 -1인지를 확인해도 값을 찾았는지 못 찾았는지 알 수 있슴다
        if (cnt == 1) {
        	System.out.printf("%d %d\n", Sheep, Goat);
        }
        else
        	System.out.println(-1);
	}
}

