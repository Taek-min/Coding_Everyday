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
		
		while(true) {
			time = time + l;
			for(int i =time; i < time + 5; i++) {
				if(i % d == 0) {
					System.out.println(i);
					return;
				}
			}
			count++; // 곡 수.
			if(count > n) {
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



