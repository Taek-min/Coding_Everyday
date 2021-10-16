import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int round = scan.nextInt();
		int changYoung;
		int sangDeok;
		int sangPoint = 100;
		int changpoint = 100;
		for(int i = 0 ; i < round ; i++){
			changYoung = scan.nextInt();
			sangDeok = scan.nextInt();
			if(sangDeok == changYoung){
				continue;
			}
			if(sangDeok > changYoung) {
				changpoint-=sangDeok;
			}
			if(sangDeok < changYoung){
				sangPoint-=changYoung;
			}
		}
		
		System.out.println(changpoint);
		System.out.println(sangPoint);
	}
}