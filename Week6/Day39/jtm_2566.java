import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[9][9];
        int max = 0, line = 0, row = 0;
        
        for(int i = 0; i < num.length; i++){
        	for(int j = 0; j < num[i].length; j++) {
        		num[i][j] = sc.nextInt();
        		if(max < num[i][j]){
        			max = num[i][j];
        			line = i;
        			row = j;
        		}
        	}
        }
        System.out.println(max);
        System.out.printf("%d %d",line+1, row+1);
    }
}