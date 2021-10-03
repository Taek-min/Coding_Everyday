import java.util.Scanner; //// 아래 줄바꿈 국룰
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int refusalCnt = 0;
		int seat[] = new int[loop]; //// 옭 필요한 만큼만~~ 
		for(int i = 0; i < loop; i++) { //// 변수들 선언에서 실제 로직 동작으로 '맥락'이 바뀌고 있는데, 이렇게 맥락 바뀔떄마다 줄바꿈 하나씩 더 해주면 가독성에 좋아요
			seat[i] = sc.nextInt();
			for(int j = 0; j < seat.length; j++) {
				if(i == j) {
					continue;
				}
				else if(seat[i] == seat[j]) {
					refusalCnt++;
					break;
				}
			}
		}
		System.out.println(refusalCnt);
	}
}

//// 굳굳