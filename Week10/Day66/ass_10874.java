import java.util.*;

//// (x%5+1)이 사실 1234512345인걸 깨달았다면 더 간단하게 풀었을듯요 :2
public class Main{
	public static void main(String[] args){//// 요란하게 잘풀었네~ 
		Scanner sc = new Scanner(System.in);	
		int students = sc.nextInt();
		//// 모든 testPaper를 다 저장할 필요가 없습니다. jtm 코드 참조 해보십쇼
		int testPaper[][] = new int[students][10];
		boolean reTest[] = new boolean[students];
		Arrays.fill(reTest,true);
		for(int i = 0 ; i < students ; i++){
			for(int k = 0 ; k < 10; k++){
				testPaper[i][k] = sc.nextInt(); 
				if(((k)%5)+1!=testPaper[i][k])
					reTest[i]=false;
			}
			if(reTest[i]){
				System.out.println(i+1);
			}
		}
	}
}