import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String passWord = sc.nextLine();
		///// 이 값 for문 돌려서 넣어주지
		char pwNumRange[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		double numCnt[] = new double[10];		
		int setCnt = 0;
		
		for(int i = 0; i < passWord.length(); i++) {
			for(int j = 0; j < pwNumRange.length; j++) {
				if(passWord.charAt(i) == pwNumRange[j]) {
					numCnt[j] += 1;
				}
			}
		}
		numCnt[6] = Math.ceil((numCnt[6] + numCnt[9]) / 2);
		
		for(int i = 0; i < pwNumRange.length - 1; i++) {
			if(setCnt < numCnt[i]) {
				setCnt = (int)numCnt[i];
			}
		}
		System.out.println(setCnt);
	}
}

//// 굳 :@