import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rook = sc.nextInt();  
		if(rook%2==1){
			System.out.println("SK");
		}else{
			System.out.println("CY");
		}
	}
}