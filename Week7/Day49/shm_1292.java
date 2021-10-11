import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opening = sc.nextInt();
		int finish = sc.nextInt();
		int numArray[] = new int[1000]; ////이거 구건 마지막 숫자 만큼만 만들어줘도 되지 않을까나? //// 낭만코딩
		int num = 1;
		int cnt = 1;
		int sum = 0;
		
		for(int i = 0; i < numArray.length; i++) {
			if(cnt == num) {
				numArray[i] += num;
				num++;
				cnt = 1;
			} 
			else {
				numArray[i] += num;
				cnt++;
			}
		}
		for(int i = opening - 1; i < finish; i++) {
			sum += numArray[i];
		}
		System.out.println(sum);
	}
}
