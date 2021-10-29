import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//// sides[변들] arraySides[배열변들] 변수 이름이 직관적이지 못한 점이 아쉽습니다 : 그렇군요
			//// 그냥 곧바로 배열로 만들어버리고 sides로 하거나, 지금 그대로 하고 sideInfos, sides 정도로 이름 붙이는거 추천합니다 : 인지했습니다.
			//// 그리고 Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); 요렇게 바로 int[]로 만드는 방법도 있습니다. 이건 그냥 참고만 하십셔 : 감사합니다 (_ _)
			//// ㄴ 그의 피드백이 돌아왔다 ㅋㅋ 
			String sides = sc.nextLine();
			String arraySides[] = sides.split(" ");
			int max = 0;
			int sum = 0;
			
			for(int i = 0; i < arraySides.length; i++) {
				if(arraySides[i].equals("0")) {
					return;
				}
				if(max < Integer.parseInt(arraySides[i])) {
					max = Integer.parseInt(arraySides[i]);
				}
			}
			
			for(int i = 0; i < arraySides.length; i++) {
				if(max == Integer.parseInt(arraySides[i])) {
					continue;
				}
				sum += Integer.parseInt(arraySides[i]) * Integer.parseInt(arraySides[i]);
			}
			
			if(max * max == sum) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}
}
