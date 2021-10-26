import java.util.*;

public class Main{
	public static void main(String[] args){////시험기간이라 변수명 봐줄게~
		Scanner sc = new Scanner(System.in);	
		int T = sc.nextInt();
		int n[] = new int [T];////ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		int m[] = new int [T];
		int cnt[] = new int [T];
        int plus;
		for(int i = 0 ; i < T ; i++){
			n[i] = sc.nextInt();
			m[i] = sc.nextInt();
		}
		for(int i = 0 ; i < T ; i++){	
			for(int k = n[i] ; k <= m[i] ; k++){
                plus = k;
                String str = Integer.toString(plus);
				String[] chk = str.split("");
				for(int j = 0 ; j < chk.length ; j++){
					if(chk[j].equals("0")){
						cnt[i]++;
					}
				}
			}
		}
		for(int i = 0 ; i < T ; i++){
			System.out.println(cnt[i]);
		}
	}
}