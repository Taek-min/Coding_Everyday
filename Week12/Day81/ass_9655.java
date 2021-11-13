import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rook = sc.nextInt();  
		if(rook%2==1){ //// rook % 2 == 1; 이런식으로 쓰면 더 가독성이 좋을거 같아요
			System.out.println("SK");
		}else{
			System.out.println("CY");
		}
	}
}