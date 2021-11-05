import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[8];
        for(int i = 0; i < 8; i++) {
        	score[i] = sc.nextInt();
        }
        int[] index = new int[8];
        int[] max = new int[5];
        int cnt = 0;
        
        for(int i = 0; i < 8; i++) {
            index[cnt] = score[i];
            cnt++;
        }
        
        cnt = 0;
        int sum = 0;
        Arrays.sort(score);
        
        for(int i = 3; i < 8; i++) {
            max[cnt] = score[i];
            sum += max[cnt];
            cnt++;              
        }
        System.out.println(sum);
        
        for(int i=0; i < 8; i++) {
            for(int j = 0; j < 5;j++) {
                if(index[i] == max[j]) {
                    System.out.print(i+1+" ");
                }
            }
        }
	}
}