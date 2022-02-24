import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			StringBuilder sb = new StringBuilder();
			int layer = sc.nextInt();
			int room = sc.nextInt();
			int order = sc.nextInt();
			int cnt = 1;
			
			int [][] hotel = new int[layer][room];
			
			for(int j = 1; j <= room; j++) {
				for(int k = 1; k <= layer; k++) {
					if(order == cnt) {
						layer = k;
						room = j;
						break;
					}
					cnt++;
				}
			}
			
			sb.append(layer);
			if(room < 10) {
				sb.append("0" + room);
			}
			else {
				sb.append(room);
			}
			System.out.println(sb);
		}
	}
}
