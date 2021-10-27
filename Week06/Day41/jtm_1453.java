import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int guest = sc.nextInt();
    	int[] seat = new int[100]; ////무조건 100이하로 잡은게 아쉽네요 :22 :-1-1 시간효율과 공간효율 중 뭘 추구하느냐의 차이라고 생각합니다
    	int result = 0;
    	int duplicate = 0;
    	
    	for(int i = 0; i < guest; i++) {
    		int num = sc.nextInt();
    		if(seat[num-1] == 0) {
    			seat[num-1] = num;
    		}
    		else {
    			duplicate++;
    		}
    	}
    	System.out.println(duplicate);
    }
}
//// 굳굳
