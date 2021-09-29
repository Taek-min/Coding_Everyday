import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hatNum = new int[9];
		int sumHat = 0;
		
		for(int i = 0; i < hatNum.length; i++) {
			hatNum[i] = sc.nextInt();
			sumHat += hatNum[i];
		}
		findLieDwarf(hatNum, sumHat);
		printRealDwarf(hatNum);//함수 사용하는 모습 좋습니다^^
		sc.close();//잘배워갑니다^^
	}
	
	//// 코드를 처음 보는 사람이 findLieDwarf를 읽으면 'LieDwarf를 찾아서 반환하는 함수겠구나' 할겁니다
	//// 근데 함수가 하는 일은 그게 아니쥬? 이름 다시 지어주십쇼 :2
	static void findLieDwarf(int[] hatNum, int sumHat) {
		for(int j = 0; j < hatNum.length; j++) {
			for(int k = hatNum.length-1; j < k; k--) {
				if(hatNum[j] + hatNum[k] == sumHat-100) {
					hatNum[j] = 0;
					hatNum[k] = 0;
					return;
				}
			}
		}
	}
	//// 탭 정리하세요.
	//// 하나가 아닌 여럿이면 오해가 없게 복수형으로!
	static void printRealDwarf(int[] hatNum) {
		for(int i = 0; i < hatNum.length; i++) {
			if(hatNum[i] != 0) {
				System.out.println(hatNum[i]);
			}
		}
	}
}//// 함수활용 너무좋구,,,화이팅!
