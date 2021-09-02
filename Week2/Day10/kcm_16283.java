//// 백준에 제출해서 맞은 코드를 올려주십쇼
package Day10

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		//// 직관적인 변수명 굳굳
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
        //// 변수명은 count지만 사실상 '양/염소 마리수가 구해졌느냐?'를 저장하는 역할인거같은데
		//// 안 어울리는 변수명도 변수명이지만 없어도 괜찮은 변수인 것 같아요
		//// 예를들어 sheepAmount, goatAmount를 -1로 초기화하고 마지막에 저 두 값이 -1인지를 확인하면 값을 찾았는지 못 찾았는지 알 수 있슴다
		if(count == 1){
            System.out.println(sheepAmount + " " + goatAmount);
        }
        else{
            System.out.println(-1);
        }
	}
}