import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String answer = "1 2 3 4 5 1 2 3 4 5";	
		int students = sc.nextInt();
		in.nextLine();
		for(int i = 0 ; i < students ; i++){
			String testpaper = in.nextLine();
			if(testpaper.equals(answer)) {
				System.out.println(i + 1);
			}
		}
	}
}