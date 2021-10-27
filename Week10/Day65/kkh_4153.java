import java.util.*;

//// 깔끔
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			int line[] = new int[3];
			
			for(int i = 0; i < 3; i++) {
				line[i] = in.nextInt();
			}
			
			//// 변 딱 하나만 0 체크해도 괜춘함!
			if(line[0] == 0 && line[1] == 0 && line[2] == 0) break;
			
			Arrays.sort(line);	
			
			if((line[0] * line[0]) + (line[1] * line[1]) == (line[2] * line[2])) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}