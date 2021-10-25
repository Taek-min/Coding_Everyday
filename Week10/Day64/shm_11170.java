import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int startNum = sc.nextInt();
			int finalNum = sc.nextInt();
			int cnt = 0;
			for(int j = startNum; j <= finalNum; j++) {
				if(Integer.toString(j).contains("0")) {
					for(int k = 0; k < Integer.toString(j).length(); k++) {
						if(Integer.toString(j).charAt(k) == '0') {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}