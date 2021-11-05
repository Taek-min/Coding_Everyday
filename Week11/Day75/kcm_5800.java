import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int classes = in.nextInt();
		in.nextLine();

		for(int i = 1; i <= classes; i++) {
			int students[] = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int gap = 0;
			Arrays.sort(students, 1, students.length);

			for(int j = 1; j < students[0]; j++) {
				if(gap < students[j+1] - students[j]) {
					gap = students[j+1] - students[j];
				}	
			}
			
			System.out.println("Class " + i );
			System.out.println("Max " + students[students.length - 1] + ", Min " + students[1] + ", Largest gap " + gap);
		}
	}
}
