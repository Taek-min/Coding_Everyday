import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		String stars = ""; //// 담아서 출력하려 해본거 굿. :22 출력함수 실행마다 시간이 꽤 걸려서 담아서 출력해주면 시간이 줄어듬.
		for(int i = 0; i < line; i++) {
			stars = "";
			for(int j = 0; j <= i; j++) {
				stars += "*";
			}
			for(int k = i+1; k < line*2 ; k++) {
				if(k >= line*2 - (i + 1)) {
					stars += "*";
				}
				else {
					stars += " ";
				}
			}
			System.out.println(stars);
		}
		for(int l = 0; l < line-1; l++) {
			stars = "";
			for(int z = 1; z < line -l; z++) {
				stars += "*";
			}
			for(int t = line- l; t <= line*2; t++) {
				if(t > line + l +1) {
					stars += "*";
				}
				else {
					stars += " ";
				}
			}
			System.out.println(stars);
		}
	}
}
//// 창민이 잘해~ : 22 : 33