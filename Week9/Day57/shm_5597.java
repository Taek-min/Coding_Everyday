import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudent[] = new int[31];
		
		for(int i = 1; i < 29; i++) {
			int num = sc.nextInt();
			numOfStudent[num] = 1;
		}
		
		for(int i = 1; i < numOfStudent.length; i++) {
			if(numOfStudent[i] != 1)
				System.out.println(i);
		}
	}
}