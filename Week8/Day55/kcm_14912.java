import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int searchNum = in.nextInt();
		int count = 0;

		for(int i = 1; i <= num; i++) {
			String strNum = Integer.toString(i);
			for(int j = 0; j < strNum.length(); j++) {
				if(strNum.charAt(j) - '0' == searchNum) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}//// 굿굿굿 ~! :잘잘잘해~ :3