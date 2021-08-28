package baekjoon;

import java.util.Scanner;
public class kcm_1333 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int d = in.nextInt(); 
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
				
			}
			count++; // 곡 수.
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



