import java.util.*; //// 이 아래 줄바꿈 해주는게 국룰
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
        			row = j; //// 행이 아니라 열입니다
        		}
        	}
        }
        System.out.println(max);
        System.out.printf("%d %d",line+1, row+1); //// 쉼표 다음에 띄어쓰기 하나 해주는게 국룰
    }
}
////굳 :2