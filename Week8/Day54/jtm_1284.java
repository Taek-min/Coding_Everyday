import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int address[] = Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).toArray();
			int width = 0;
			if(address[0] == 0) {
				break;
			}
				
			for(int i = 0; i < address.length; i++) {
				if(address[i] == 1) {
					width += 3;
				}
				else if(address[i] == 0) {
					width += 5;
				}
				else {
					width += 4;
				}
			}
			System.out.println(width+1);
		}
	}
}
//// 굳:22 정석
