import java.util.Scanner;

public class Main {
	////깔꼼 :2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //// 배열 2개로 하니깐 깔끔하네 : 22
		//// 아이디어 굿
		String[] dayOfWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int totalDays = day;
		for (int i = 0; i < month - 1; ++i) {
			totalDays += dayOfMonth[i];
		}
		
		System.out.println(dayOfWeeks[totalDays % 7]);
	}
}