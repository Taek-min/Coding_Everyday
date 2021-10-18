import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int students[] = new int[31];
		
		for(int i = 0; i < 28; i++) {
			int student = in.nextInt();
			students[student] = student;
		}
		
		for(int j = 1; j < students.length; j++) {
			if(students[j] == 0) {
				System.out.println(j);
			}
		}
	}
}
