package Day14;
import java.util.Scanner;
public class kcm_2501 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int num = in.nextInt();
		int location = in.nextInt();
		
		for(int i = 1; i <=num; i++) {
			if(num % i == 0) {
				count++;
				if(count == location) {
					System.out.println(i);
					//// break 넣어주면 좋을 것 같아요! 지금은 찾았어도 무조건 num까지 반복하니
				}
			}
		}
		if(count < location) {
			System.out.println(0);
		}

	}

}
