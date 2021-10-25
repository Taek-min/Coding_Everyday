import java.util.*;

public class Main {// 간단하게 잘풀었네 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		char chessBoard[][] = new char [8][8];
		int cnt = 0;
		
		for(int i = 0; i < 8 ; i++){
			String str = sc.nextLine();
			for(int j = 0 ; j < 8 ; j++){
				chessBoard[i][j] = str.charAt(j);
				if((i+j)%2==0 && chessBoard[i][j] == 'F'){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}