import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int female male, intern;
		female = sc.nextInt();
		male = sc.nextInt();
		intern = sc.nextInt();
		
		int  team= 0;
		while(female >= 2 && male >=1) {
			female -= 2;
			male--;
			team ++;
		}
		
		while(female + male < intern) {
			female += 2;
			male++;
			team--;
		}
		System.out.println(team);
	}
}////뭔가 신기하게 잘푼단말이야

