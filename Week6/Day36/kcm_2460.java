import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nowPerson = 0;
		int maxPerson = 0;
		
		for(int i = 0; i < 10; i++ ) {
			int out = in.nextInt();
			int enter = in.nextInt();
			nowPerson -= out;
			nowPerson += enter;
			if(maxPerson < nowPerson) {
				maxPerson = nowPerson;
			}
		}
		System.out.println(maxPerson);

	}

}
//// 줄바꿈 상당히 거슬리네요. :2