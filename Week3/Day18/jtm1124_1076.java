package algorithm; //// 백준에 제출했을 때 맞은 코드로 제출해주세요~
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 배열 이름은 앵간하면 복수형으로 나타내주십쇼
		String color[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		//// 고냥 values 했어도 괜찮을 것 같아요 multi라는 단어가 반드시 필요하진 않아보입니다
		int multiVal[] = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};//// 제곱근쓰면 없어도 될것 같습니다!
		String input[] = new String[3];
		//// '결과 자리수'라는 이름으로 무얼 말하고싶은지 잘 모르겠어요. 몇번째 색인지를 나타내는거니 저라면 targetIndicies(대상 인덱스들)로 지었을 것 같습니다. 간단하게는 kcm 코드처럼 index도 괜찮을 것 같아요
		int[] resultDigit = new int[3];
		
		for (int i = 0; i < 3; i++) {
			input[i] = sc.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				if (input[i].equals(color[j])) {
					resultDigit[i]=j;
				}
			}
		}
		
		long resistance = resultDigit[0]*10 + resultDigit[1];
		System.out.println(resistance * multiVal[resultDigit[2]]);
	}
}
	

