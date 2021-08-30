import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int female, male, intern;  //// , 빠져서 넣어드렷습니다.
		female = sc.nextInt();
		male = sc.nextInt();
		intern = sc.nextInt();
		
		int  team= 0;
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

