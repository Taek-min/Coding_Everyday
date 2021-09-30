import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//// 전체 합(total)보다는 가짜 드워프의 합으로 쓰이는 변수같은데 total로 이름 지어진 점이 조금 어색합니다 : sum으로 바꿔주세요
		//// 결과론적으로는 가짜 드워프의 합을 구하기 위해 사용됐지만 과정까지 본다면 가짜드워프를 제외한 7명의 드워프 합까지 포함이 됐기 때문에 total로 사용했습니다
		//// 그래도 변경하는 방향이 더 좋다하면 반영하겠습니다 선생님 
		int total = -100;
		int dwarf[] = new int[9];
		int fake1 = 0;
		int fake2 = 0;
		
		for(int i = 0; i < dwarf.length; i++) {
			dwarf[i] = sc.nextInt();
			total += dwarf[i];
		}
		for(int i = 0; i < dwarf.length; i++) {
			for(int j = 1; j < dwarf.length; j++) {
				if(total == dwarf[i] + dwarf[j]) {
					fake1 = i;
					fake2 = j;
				}
			}
		}
		for(int i = 0; i < dwarf.length; i++) {
			if(i == fake1 || i == fake2) {
				continue;
			}
			else {
				System.out.println(dwarf[i]);
			}
		}
	}
}
//// 완전 정석이네 :2 :3
