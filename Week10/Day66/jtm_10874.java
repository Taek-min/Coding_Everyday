import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		int[] answer= new int[11];
		for(int i = 1; i <= students; i++){
			boolean retest = true;
			for (int j = 1; j <= 10; j++){
				answer[j] = sc.nextInt();
				if (answer[j] != (j-1) % 5 + 1) {
					retest = false;
				}
		    }
		    if (retest == true) {
		        System.out.println(i);
		    } 
		}
	}
}


