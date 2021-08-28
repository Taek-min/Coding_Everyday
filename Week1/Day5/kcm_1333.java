package baekjoon;

import java.util.Scanner;
public class kcm_1333 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//// 문제 입력이 하나가 아니라 여러개면 N, L, D처럼 문제에서 지어준 이름 그대로 쓰기보다는
    //// songAmount 식으로 지어주는게 훨씬 가독성이 나음
		int n = in.nextInt();
		int l = in.nextInt();
		int d = in.nextInt(); 
		//// 변수 작명, 함수 작명등으로 코드의 의도를 최대한 설명해보고 정말 불가피할때 다는게 주석임 (이외에는 안 다는게 좋음)
		//// songAmount, currentTime 등으로 이름을 짓고 주석을 없애면 더 깔끔할듯
		int count= 1; // 곡 수 
		int time = 0; // 현재 시간
		
		//// 곡 수가 정해져 있으니까 곡 수 만큼 for돌리고 나머지를 따로 처리해주면 더 간단해지지 않을까??
		while(true) {
			time = time + l;
			for(int i =time; i < time + 5; i++) {
				if(i % d == 0) {
					System.out.println(i);
					return;
				}

				//// 불필요한 줄바꿈 노노
			}
			count++; // 곡 수.
			//// 모든 곡을 플레이했다면 break;해서 나오게 하고 31~36줄의 반복문은 while문 밖에서 하게 했다면 더 깔끔했을 듯
			if(count > n) {					////이 if문이 앨범 내 모든 곡이 재생 된 후 조건문인건가? 현민
				////이 밑에 for이랑 if를 while문 하나로 표현할 수 있지 않을까??
				for(int j =1; ; j++) {
					if(d * j >= time) {
						System.out.println(d*j);
						return;
					}
				}
			}
			time += 5;
		}
	}		
}



