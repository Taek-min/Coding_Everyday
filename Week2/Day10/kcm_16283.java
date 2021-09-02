//// 백준에 제출해서 맞은 코드를 올려주십쇼
//// ㄴ 백준에 맞는 코드 올려서 한건데?
package Day10;

import java.util.Scanner;

public class kcm_16283
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
	        for(int goat = animalAmount - sheep; goat + sheep <= animalAmount; goat++){ //// 이 for문이 필요없었을수도?
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