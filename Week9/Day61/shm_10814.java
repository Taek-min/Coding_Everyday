import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		String info[][] = new String[loop][2];
		
		for(int i = 0; i < loop; i++) {
			info[i][0] = sc.next();
			info[i][1] = sc.next();
		}
		Arrays.sort(info, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		
		for(int i = 0; i < loop; i++) {
			System.out.println(info[i][0] + " " + info[i][1]);
		}
	}
}////고생했으..
