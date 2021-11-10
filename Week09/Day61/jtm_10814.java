import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  member= sc.nextInt();
		String[][] info = new String[member][2];
		
 
		for(int i = 0; i < member; i++) {
			info[i][0] = sc.next();
			info[i][1] = sc.next();	
		}
 
		
		Arrays.sort(info, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		for(int i = 0; i < member; i++) {
			System.out.println(info[i][0] + " " + info[i][1]);
		}
	}
}
