import java.util.Scanner;
public class Main {
	////다들 너무 잘풀어~:22 좀 하네~? 파이썬 개꿀인정~ㅋ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int smileFind = sentence.indexOf(":-)");
		int cryFind = sentence.indexOf(":-(");
		int cnt = 0;
		boolean findFace = smileFind != -1 || cryFind != -1; 
		
		if(findFace) {
			while(true) {
				if(smileFind == -1 && cryFind == -1) {
					break;
				}
				else {
					int nextFind = 0;
					if(smileFind != -1) {
						nextFind = sentence.indexOf(":-)", smileFind + 1);
						smileFind = nextFind;
						cnt++;
					}
					else {
						nextFind = sentence.indexOf(":-(", cryFind + 1);
						cryFind = nextFind;
						cnt--;
					}
				}
			}
			if(cnt > 0) {
				System.out.println("happy");
			}
			else if(cnt < 0) {
				System.out.println("sad");
			}
			else {
				System.out.println("unsure");
			}
		}
		else {
			System.out.println("none");
		}
	}
}
