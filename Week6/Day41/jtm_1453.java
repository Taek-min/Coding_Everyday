import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int guest = sc.nextInt();
    	int[] seat = new int[100]; ////무조건 100이하로 잡은게 아쉽네요 
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
