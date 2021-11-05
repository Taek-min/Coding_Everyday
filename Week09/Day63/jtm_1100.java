import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int size = 8;
	    char[][] chessBoard = new char[size][size];
	    int num = 0;
	    String str = "";

	    for (int i = 0; i < size; i++) {
	      	str = scanner.nextLine();

		  	for (int j = 0; j < size; j++) {
			  chessBoard[i][j] = str.charAt(j);
			  if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
				  num++;
				}
			}
	    }
	    System.out.println(num);
	}
}
