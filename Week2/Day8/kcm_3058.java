package Day8;

import java.util.Scanner;

public class kcm_3058 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int num[] = new int[7];
		for(int j = 1; j <= count; j++) {
			int min = 0;
			int sum = 0;
			for(int i=0; i < num.length; i++) {
				num[i] = in.nextInt();
				if(num[i] % 2 == 0) {
					//// min을 배열의 첫 원소값으로 초기화하면 18~20줄을 없앨 수 있어서 더 깔끔할 것 같아 : 22 : 33 아니면 100으로 <- 확인.
					//// 배열의 첫 원소값으로 하면은 첫 원소값이 1이 되면 최소가 구할수가없어서 2로 나눠지는것중에 처음걸로 넣엇습니다.
					if(min == 0) {
						min = num[i];
					}
					//// 이건 그냥 팁인데 min = (min > num[i]) ? num[i] : min; 이렇게 삼항식 사용하면 밑 세줄을 한 줄로 줄일 수 있음 
					//// 감사합니다 피드백달러왔다가 삼항식 보고 갑니다.
					if(min > num[i]) {
						min = num[i];
					}		
					sum += num[i];
				}
			}
			System.out.println(sum + " " + min);
		}

	}

}
