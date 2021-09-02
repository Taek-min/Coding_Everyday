import java.util.Scanner;
class Main{
	//// 무난쓰
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//// 항상 백준에 제출해서 맞은 코드로 업로드 부탁

		int female, male, intern;  //// , 빠져서 넣어드렷습니다.
		female = sc.nextInt();
		male = sc.nextInt();
		intern = sc.nextInt();
		
		int  team= 0; //// 띄어쓰기 불-편
		//// 반복문 하나로 풀 수 있지 않을까나??
		//// while안에 if문으로 나누면 되긴하지만 뭔가 대칭이라 이쁘니까 ㅎㅎ 담엔 그렇게 하겠습니다.
		while(female >= 2 && male >=1) {
			female -= 2;
			male--;
			team ++;
		}
		
		while(female + male < intern) {  //// 이거 위에 while 문에 if문으로 해서 넣고 team 수만 증가 시키면 어떨가 싶습니다.
					
			female += 2;
			male++;
			team--;
		}
		System.out.println(team);
	}
}////뭔가 신기하게 잘푼단말이야

