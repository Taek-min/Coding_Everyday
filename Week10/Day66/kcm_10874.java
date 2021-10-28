import java.util.Scanner;

//// 깔끔
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "1 2 3 4 5 1 2 3 4 5";
		int students = in.nextInt();
		in.nextLine();
		for(int i = 0; i < students; i++) {
			String str = in.nextLine();
			if(str.equals(answer)) {
				System.out.println(i +1); //// +1 사이 띄어쓰기!
			}
		}

	}
}
