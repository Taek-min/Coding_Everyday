import java.util.Scanner;

public class Main {
	////굿이에용~ : 22
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wordLength = sc.nextInt();
		char[] word = sc.next().toCharArray();
		long sumHidden = 0, tmp = 0;
		
		for (int i = 0; i < wordLength; i++) {
			if (word[i] >= '0' && word[i] <= '9') {
				//// hiddenNumber 등으로 이름 충분히 지을 수 있었을듯합니다 :2
				tmp = tmp * 10 + word[i] - '0';
			} 
			else {
				//// 주석은 정말 불가피할때만. 줄임말을 모를거같다 싶으면 그냥 늘여쓰는게 좋음
				sumHidden += tmp; //temporary
	                tmp = 0;
			}
		}
		sumHidden += tmp;
		System.out.println(sumHidden);
	}
}
