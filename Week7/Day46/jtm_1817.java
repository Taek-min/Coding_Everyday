import java.util.*; //// 패키지 지워드렷어요 

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int bookCount, maxWeigth, cntBox = 1; 
    	int sum = 0;
    	int[] bookWeight = new int[100001];
    	bookCount = sc.nextInt();
    	maxWeigth = sc.nextInt();
    	if(bookCount == 0) {
    		System.out.println(0);
    		return;
    	}
    	for(int i = 0; i < bookCount; i++) {
    		bookWeight[i] = sc.nextInt();
    	}
    	for(int i = bookCount - 1; i >= 0; i--) {
    		sum += bookWeight[i];
    		if(sum > maxWeigth) {
    			cntBox++;
    			sum = bookWeight[i];
    		}
    	}
    	System.out.println(cntBox);
    }
}//// 귣귣 :2
