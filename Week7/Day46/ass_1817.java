import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bookCnt = scan.nextInt();
		int boxIn = scan.nextInt();
		int books[]= new int [100001];
		int nextBookCnt = bookCnt - 1;
		int boxCheck=boxIn;
        int cnt = 0;
        int boxCnt=0;
		for(int i = 0 ; i < bookCnt ; i++){
		    books[i] = scan.nextInt();
		}
	    while(cnt != bookCnt){
	       for(int i = nextBookCnt ; i>=0;i--){
	           if(books[i] <= boxCheck){
	               boxCheck-=books[i];
	               cnt++;
	               nextBookCnt--;
	           }else{
	               break;
               }
	       }
	       boxCheck=boxIn;
	       boxCnt++;
		}
		System.out.println(boxCnt);
	}
}