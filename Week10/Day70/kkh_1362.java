import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int oSize = in.nextInt();
		int wSize = in.nextInt();
		int scenario = 1;
		
		while(oSize != 0 || wSize != 0) {
			String[] action = in.nextLine().split(" "); 
			
			if(action[0].equals("F") && wSize > 0) {
				wSize += Integer.parseInt(action[1]);
			} else if(action[0].equals("E") && wSize > 0) {
				wSize -= Integer.parseInt(action[1]);
			} else if (action[0].equals("0") && action[1].equals("0")) {
				break;
			} else if(action[0].equals("#") && action[1].equals("0")) {
				if(wSize < 1) {
					System.out.println(scenario + " RIP");
				} else if(oSize * 0.5 < wSize && wSize < oSize * 2) {
					System.out.println(scenario + " :-)");
				} else {
					System.out.println(scenario + " :-(");
				}
				oSize = in.nextInt();
				wSize = in.nextInt();
				scenario++;
			} 
		}
	}
}