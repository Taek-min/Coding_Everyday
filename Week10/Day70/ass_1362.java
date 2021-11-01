import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cnt = 1;	
		
		while(true){
			int o = sc.nextInt(); //심플..
			int w = sc.nextInt(); //하네..
			boolean life = true;
			if(o==0 && w==0){
				break;
			}
			
			while(true){
				char action = sc.next().charAt(0);
				int actionNum = sc.nextInt();
				
				if(w <= 0) {
					life = false;
				}
				
				if(action=='E'){
					w-=actionNum;
				}else if(action=='F'){
					w+=actionNum;
				}else if(action=='#'){
					if(life) {
						if(o / 2 < w && w < o * 2){
							System.out.println(cnt + " :-)");
						}else{
							System.out.println(cnt + " :-(");
						}
					}else{
						System.out.println(cnt + " RIP");
					}	
					break;
				}
			}
			cnt++;
		}
	}
}
//조아조아~~